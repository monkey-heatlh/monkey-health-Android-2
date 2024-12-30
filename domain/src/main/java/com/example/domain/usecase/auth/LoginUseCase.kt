package com.example.domain.usecase.auth

import com.example.domain.model.auth.request.LoginRequestModel
import com.example.domain.model.auth.response.LoginResponseModel
import com.example.domain.repository.AuthRepository
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class LoginUseCase @Inject constructor(
    private val authRepository: AuthRepository
) {
    suspend operator fun invoke(body: LoginRequestModel): Flow<LoginResponseModel> =
        authRepository.login(body = body)
}