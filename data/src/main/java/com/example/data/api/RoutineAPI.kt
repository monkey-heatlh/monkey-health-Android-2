package com.example.data.api

import com.example.data.di.RequestUrls
import retrofit2.http.GET

interface RoutineAPI {
    @GET(RequestUrls.ROUTINE.read)
    suspend fun readRoutine(

    )

}