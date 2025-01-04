package com.example.data.api

import com.example.data.di.RequestUrls
import retrofit2.http.GET
import retrofit2.http.POST

interface RoutineAPI {
    @GET(RequestUrls.ROUTINE.read)
    suspend fun readRoutine(

    )
    @POST(RequestUrls.ROUTINE.save)
    suspend fun saveRoutine(

    )
}