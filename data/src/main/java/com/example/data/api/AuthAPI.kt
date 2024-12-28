package com.example.data.api

import com.example.data.di.RequestUrls
import retrofit2.http.Body
import retrofit2.http.Header
import retrofit2.http.POST

interface AuthAPI {
    @POST(RequestUrls.AUTH.signUp)
    suspend fun signUp(
        @Body body: singUpRequest
    )
}