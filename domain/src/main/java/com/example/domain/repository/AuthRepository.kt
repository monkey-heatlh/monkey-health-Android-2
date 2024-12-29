package com.example.domain.repository

import com.example.domain.model.auth.response.LoginResponseModel
import java.util.concurrent.Flow
import kotlin.Unit as Unit

interface AuthRepository {
    suspend fun signUp(body: signUpRequestModel): Flow <Unit>

    suspend fun login(body: LoginRequestModel): Flow<Unit>

    suspend fun tokenRefresh(refreshToken: String): Flow<Unit>

    suspend fun saveToken(token: LoginResponseModel)

    fun getRefreshToken(): Flow<String>

    suspend fun deleteToken()

    suspend fun sendCode(body: sendCodeRequestModel): Flow<Unit>

    suspend fun verifyCode(email: String, code: String): Flow<Unit>

    suspend fun logout(): Flow<Unit>
}