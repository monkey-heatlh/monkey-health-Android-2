package com.example.data.dto.request.routine

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class SaveRoutineRequest (
    @Json(name = "monday_content") val monday_content : String,
    @Json(name = "tuesday_content") val tuesday_content: String,
    @Json(name = "wednesday_content") val wednesday_content: String,
    @Json(name = "thursday_content") val thursday_content: String,
    @Json(name = "friday_content") val friday_content: String
)
