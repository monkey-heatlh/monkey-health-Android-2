package com.example.domain.repository

import com.example.domain.model.auth.request.PostLoginRequestModel
import com.example.domain.model.auth.response.LoginResponseModel
import java.util.concurrent.Flow

interface AuthRepository {
    suspend fun signUp(body: signUpRequestModel): Flow <Unit>

    suspend fun login(body: LoginRequestModel): Flow<Unit>

    suspend fun tokenRefresh(refreshToken: String): Flow<Unit>

    suspend fun saveToken(token: LoginResponseModel)
}