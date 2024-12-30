package com.example.domain.repository

import com.example.domain.model.calender.request.SaveCalenderRequestModel
import java.util.concurrent.Flow

interface CalenderRepository {
    fun dataCalender(body: SaveCalenderRequestModel): Flow<Unit>
}