package com.example.data.dto.request.auth

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class SendCodeRequest (
    @Json(name = "email") val email: String
)