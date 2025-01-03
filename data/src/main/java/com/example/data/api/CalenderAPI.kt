package com.example.data.api

import com.example.data.di.RequestUrls
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.POST


interface CalenderAPI {
    @GET(RequestUrls.CALENDER.date)
    suspend fun date(

    )
    @POST(RequestUrls.CALENDER.save)
    suspend fun save(

    )
}