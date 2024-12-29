package com.example.domain.usecase.auth

import com.example.domain.repository.AuthRepository
import javax.inject.Inject

class VerifyCodeUseCase @Inject constructor(
    private val authRepository: AuthRepository
) {
    suspend operator fun invoke(email: String, authCode: String) = kotlin.runCatching {
        authRepository.verifyCode(email = email, code = code)
    }
}