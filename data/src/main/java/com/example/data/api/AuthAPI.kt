package com.example.data.api

import com.example.data.di.RequestUrls
import com.example.data.dto.request.auth.LoginRequest
import com.example.data.dto.request.auth.SendCodeRequest
import com.example.data.dto.request.auth.SignUpRequest
import com.example.data.dto.response.auth.LoginResponse
import retrofit2.http.Body
import retrofit2.http.DELETE
import retrofit2.http.Header
import retrofit2.http.POST
import retrofit2.http.Query

interface AuthAPI {
    @POST(RequestUrls.AUTH.signUp)
    suspend fun signUp(
        @Body body: SignUpRequest
    )

    @POST(RequestUrls.AUTH.signIn)
    suspend fun login(
        @Body body: LoginRequest
    )

    @POST(RequestUrls.AUTH.auth)
    suspend fun tokenRefresh(
        @Header("refresh") refreshToken: String
    ): LoginResponse

    @POST(RequestUrls.AUTH.send)
    suspend fun sendCode(
        @Body body: SendCodeRequest
    )

    @POST(RequestUrls.AUTH.verify)
    suspend fun verifyCode(
        @Query("email") email: String,
        @Query("code") code: String
    )

    @DELETE(RequestUrls.AUTH.auth)
    suspend fun logout()
}