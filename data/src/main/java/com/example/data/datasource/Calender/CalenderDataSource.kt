package com.example.data.datasource.Calender

import com.example.data.dto.response.calender.GetCalenderResponse
import kotlinx.coroutines.flow.Flow

interface CalenderDataSource {
    suspend fun getDateCalender(): Flow<List<GetCalenderResponse>>
}