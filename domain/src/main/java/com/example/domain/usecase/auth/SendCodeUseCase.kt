package com.example.domain.usecase.auth

import com.example.domain.model.auth.request.SendCodeRequestModel
import com.example.domain.repository.AuthRepository
import javax.inject.Inject

class SendNCodeUseCase @Inject constructor(
    private val authRepository: AuthRepository
) {
    suspend operator fun invoke(body: SendCodeRequestModel) = kotlin.runCatching {
        authRepository.sendCode(body = body)
    }
}