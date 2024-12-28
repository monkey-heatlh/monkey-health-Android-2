package com.example.domain.repository

import java.util.concurrent.Flow

interface AuthRepository {
    suspend fun signUp(body: signUpRequestModel): Flow <Unit>

}