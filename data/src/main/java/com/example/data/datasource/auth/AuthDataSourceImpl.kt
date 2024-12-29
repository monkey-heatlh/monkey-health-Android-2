package com.example.data.datasource.auth

import com.example.data.api.AuthAPI
import kotlinx.coroutines.Dispatchers
import javax.inject.Inject

class AuthDataSourceImpl @Inject constructor(
    private val authAPI: AuthAPI
) : AuthDataSource {
    override suspend fun signUp(body: signUpRequest): Flow<Unit> = flow {
        emit(

        )
    }.flowOn(Dispatchers.IO)
}