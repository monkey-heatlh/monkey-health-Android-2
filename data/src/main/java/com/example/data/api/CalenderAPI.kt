package com.example.data.api

import com.example.data.di.RequestUrls
import retrofit2.http.GET


interface CalenderAPI {
    @GET(RequestUrls.CALENDER.date)
    suspend fun date(

    )
}