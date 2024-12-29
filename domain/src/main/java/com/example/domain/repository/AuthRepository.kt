package com.example.domain.repository

import com.example.domain.model.auth.response.LoginResponseModel
import java.util.concurrent.Flow
import kotlin.String as String1

interface AuthRepository {
    suspend fun signUp(body: signUpRequestModel): Flow <Unit>

    suspend fun login(body: LoginRequestModel): Flow<Unit>

    suspend fun tokenRefresh(refreshToken: String1): Flow<Unit>

    suspend fun saveToken(token: LoginResponseModel)

    fun getRefreshToken(): Flow<String>
}