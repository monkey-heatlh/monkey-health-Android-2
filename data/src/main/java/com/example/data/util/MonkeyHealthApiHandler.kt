package com.example.data.util

import android.util.Log
import com.example.domain.exception.NoInternetException
import com.example.domain.exception.UnauthorizedException
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import retrofit2.HttpException
import java.net.SocketTimeoutException
import java.net.UnknownHostException

class MonkeyHealthApiHandler<T> {
    private lateinit var httpRequest: suspend () -> T

    fun httpRequest(httpRequest: suspend () -> T) =
        this.apply { this.httpRequest = httpRequest }

    suspend fun sendRequest(): T {
        return try {
            Log.d("ApiHandler", "Success")
            withContext(Dispatchers.IO) {
                httpRequest.invoke()
            }
        } catch (e: HttpException) {
            val message = e.message()
            Log.d("ApiHandler", message ?: "HttpException occurred")
            throw when (e.code()) {
                400 -> BadRequexstException(message = message)
                401 -> UnauthorizedException(message = message)
                403 -> ForBiddenException(message = message)
                404 -> NotFoundException(message = message)
                409 -> ConflictException(message = message)
                429 -> TooManyRequestException(message = message)
                in 500..599 -> ServerException(message = message)
                else -> OtherHttpException(message = message, code = e.code())
            }
        } catch (e: SocketTimeoutException) {
            throw TimeOutException(message = e.message)
        } catch (e: UnknownHostException) {
            throw NoInternetException()
        } catch (e: TokenExpirationException) {
            throw TokenExpirationException()
        } catch (e: Exception) {
            throw UnKnownException(message = e.message)
        }
    }
}