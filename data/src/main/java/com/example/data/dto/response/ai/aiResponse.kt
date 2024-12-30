package com.example.data.dto.response.ai

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class aiResponse (
    @Json(name = "angle") val angle: String,
    @Json(name = "state") val state: String,
    @Json(name = "post_angle") val post_angle: String,
    @Json(name = "ready_state") val ready_state: String
)