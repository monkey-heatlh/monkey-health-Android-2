package com.goms.domain.auth

import com.example.domain.model.auth.response.LoginResponseModel
import com.example.domain.repository.AuthRepository
import javax.inject.Inject

class SaveCodeUseCase @Inject constructor(
    private val authRepository: AuthRepository
) {
    suspend operator fun invoke(token: LoginResponseModel) = kotlin.runCatching {
        authRepository.saveToken(token = token)
    }
}