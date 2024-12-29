package com.example.data.datasource.auth

import com.example.data.dto.request.auth.LoginRequest
import com.example.data.dto.request.auth.SendCodeRequest
import com.example.data.dto.request.auth.SignUpRequest
import com.example.data.dto.response.auth.LoginResponse
import kotlinx.coroutines.flow.Flow

interface AuthDataSource {
    suspend fun signUp(body: SignUpRequest): Flow<Unit>

    suspend fun login(body: LoginRequest): Flow<LoginResponse>

    suspend fun tokenRefresh(refreshToken: String): Flow<LoginResponse>

    suspend fun sendCode(body: SendCodeRequest): Flow<Unit>

    suspend fun verifyCode(email: String, code: String): Flow<Unit>

    suspend fun logout(): Flow<Unit>
}