package com.example.domain.repository

import com.example.domain.model.auth.request.PostLoginRequestModel
import java.util.concurrent.Flow

interface AuthRepository {
    suspend fun signUp(body: signUpRequestModel): Flow <Unit>

    suspend fun login(body: LoginRequestModel): Flow<Unit>
}