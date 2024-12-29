package com.example.data.dto.request.auth

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class SignUpRequest(
    @Json(name = "email") val email: String,
    @Json(name = "password") val password: String
)