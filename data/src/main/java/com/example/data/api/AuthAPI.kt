package com.example.data.api

import android.view.PixelCopy.Request
import com.example.data.di.RequestUrls
import retrofit2.http.Body
import retrofit2.http.Header
import retrofit2.http.POST
import retrofit2.http.GET

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
        @Header("refresh")
    )
}