package com.example.data.dto.request.auth

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class VerifyCodeRequest (
    @Json(name = "email") val email: String,
    @Json(name = "code") val code: String
)