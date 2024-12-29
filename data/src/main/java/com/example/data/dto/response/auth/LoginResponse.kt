package com.example.data.dto.response.auth

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class LoginResponse (
    @Json(name = "accessToken") val accessToken: String,
    @Json(name = "refreshToken") val refreshToken: String,
    @Json(name = "accessTokenExp") val accessTokenExp: String,
    @Json(name = "refreshTokenExp") val refreshTokenExp: String
)