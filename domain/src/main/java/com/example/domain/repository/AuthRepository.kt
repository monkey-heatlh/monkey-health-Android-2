package com.example.domain.repository

import com.example.domain.model.auth.response.LoginResponseModel
import okhttp3.internal.http2.ErrorCode
import java.util.concurrent.Flow

interface AuthRepository {
    suspend fun signUp(body: signUpRequestModel): Flow <Unit>

    suspend fun login(body: LoginRequestModel): Flow<Unit>

    suspend fun tokenRefresh(refreshToken: String): Flow<Unit>

    suspend fun saveToken(token: LoginResponseModel)

    fun getRefreshToken(): Flow<String>

    suspend fun deleteToken()

    suspend fun sendNumber(body: sendNumberRequestModel): Flow<Unit>

    suspend fun verifyNumber(email: String, code: String): Flow<Unit>

    suspend fun logout(): Flow<Unit>
}