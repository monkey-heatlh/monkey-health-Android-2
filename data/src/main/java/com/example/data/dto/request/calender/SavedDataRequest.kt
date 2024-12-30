package com.example.data.dto.request.calender

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class SavedDataRequest (
    @Json(name = "content") val content: String
)