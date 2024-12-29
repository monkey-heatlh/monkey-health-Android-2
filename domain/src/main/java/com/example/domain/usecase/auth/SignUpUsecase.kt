package com.example.domain.usecase.auth

import com.example.domain.model.auth.request.SignUpRequestModel
import com.example.domain.repository.AuthRepository
import javax.inject.Inject

class SighUpUseCase @Inject constructor(
    private val authRepository: AuthRepository
) {
    suspend operator fun invoke(body: SignUpRequestModel) = kotlin.runCatching {
        authRepository.signUp(body = body)
    }
}