package com.example.data.datasource.auth

import com.example.data.MonkeyHealthApplication
import com.example.data.api.AuthAPI
import com.example.data.dto.request.auth.LoginRequest
import com.example.data.dto.request.auth.SendCodeRequest
import com.example.data.dto.response.auth.LoginResponse
import com.example.data.util.MonkeyHealthApiHandler
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn
import javax.inject.Inject

class AuthDataSourceImpl @Inject constructor(
    private val authAPI: AuthAPI
) : AuthDataSource {
    override suspend fun signUp(body: signUpRequest): Flow<Unit> = flow {
        emit(
            MonkeyHealthApiHandler<Unit>()
                .httpRequest { authAPI.signUp(body = body) }
                .sendRequest()
        )
    }.flowOn(Dispatchers.IO)

    override suspend fun login(body: LoginRequest): Flow<LoginResponse> {
        TODO("Not yet implemented")
    }

    override suspend fun tokenRefresh(refreshToken: String): Flow<LoginResponse> {
        TODO("Not yet implemented")
    }

    override suspend fun sendCode(body: SendCodeRequest): Flow<Unit> {
        TODO("Not yet implemented")
    }

    override suspend fun verifyCode(email: String, code: String): Flow<Unit> {
        TODO("Not yet implemented")
    }

    override suspend fun logout(): Flow<Unit> {
        TODO("Not yet implemented")
    }
}