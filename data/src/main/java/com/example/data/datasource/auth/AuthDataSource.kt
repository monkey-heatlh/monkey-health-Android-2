package com.example.data.datasource.auth

import com.example.data.dto.request.auth.LoginRequest
import com.example.data.dto.request.auth.SignUpRequest
import com.example.data.dto.response.auth.LoginResponse
import kotlinx.coroutines.flow.Flow

interface AuthDataSource {
    suspend fun signUp(body: SignUpRequest): Flow<Unit>

    suspend fun login(body: LoginRequest): Flow<LoginResponse>
}