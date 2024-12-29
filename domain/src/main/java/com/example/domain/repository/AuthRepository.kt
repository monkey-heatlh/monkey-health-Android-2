package com.example.domain.repository

import com.example.domain.model.auth.request.LoginRequestModel
import com.example.domain.model.auth.request.SignUpRequestModel
import com.example.domain.model.auth.request.SendCodeRequestModel
import com.example.domain.model.auth.response.LoginResponseModel
import kotlinx.coroutines.flow.Flow

interface AuthRepository {
    suspend fun signUp(body: SignUpRequestModel): Flow<Unit>

    suspend fun login(body: LoginRequestModel): Flow<Unit>

    suspend fun tokenRefresh(refreshToken: String): Flow<Unit>

    suspend fun saveToken(token: LoginResponseModel)

    fun getRefreshToken(): Flow<String>

    suspend fun deleteToken()

    suspend fun sendCode(body: SendCodeRequestModel): Flow<Unit>

    suspend fun verifyCode(email: String, code: String): Flow<Unit>

    suspend fun logout(): Flow<Unit>
}
