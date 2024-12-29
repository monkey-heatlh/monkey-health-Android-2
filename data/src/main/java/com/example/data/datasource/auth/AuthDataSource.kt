package com.example.data.datasource.auth

import com.example.data.dto.request.auth.SignUpRequest
import kotlinx.coroutines.flow.Flow

interface AuthDataSource {
    suspend fun signUp(body: SignUpRequest): Flow<Unit>
}