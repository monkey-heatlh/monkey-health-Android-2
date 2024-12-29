package com.example.data.dto.request.calender

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class SavedDataRequest (
    @Json(name = "id") val id: String,
    @Json(name = "email") val email: String,
    @Json(name = "content") val content: String,
    @Json(name = "data") val data: String
)