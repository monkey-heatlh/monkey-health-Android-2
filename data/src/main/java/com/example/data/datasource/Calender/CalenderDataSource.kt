package com.example.data.datasource.Calender

import com.example.data.dto.response.calender.CalenderResponse
import kotlinx.coroutines.flow.Flow

interface CalenderDataSource {
    suspend fun getDateCalender(): Flow<List<CalenderResponse>>
}