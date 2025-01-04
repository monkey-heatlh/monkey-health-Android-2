package com.example.data.api

import com.example.data.di.RequestUrls
import retrofit2.http.POST

interface AiAPI {
    @POST(RequestUrls.AI.analyzePushup)
    suspend fun analyzePushup(

    )
}