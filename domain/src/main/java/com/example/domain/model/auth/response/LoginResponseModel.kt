package com.example.domain.model.auth.response

data class LoginResponseModel (
    val accessToken : String,
    val refreshToken : String,
    val accessTokenExp : String,
    val refreshTokenExp : String
)