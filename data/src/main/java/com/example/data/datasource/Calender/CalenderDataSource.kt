package com.example.data.datasource.Calender

import com.example.data.dto.response.calender.GetCalenderResponse

interface CalenderDataSource {
    suspend fun getDateCalender(): Flow<List<GetCalenderResponse>>
}