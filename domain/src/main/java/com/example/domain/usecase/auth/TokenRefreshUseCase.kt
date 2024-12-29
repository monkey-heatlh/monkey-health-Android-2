package com.example.domain.usecase.auth

import com.example.domain.model.auth.response.LoginResponseModel
import com.example.domain.repository.AuthRepository
import javax.inject.Inject
import kotlinx.coroutines.flow.Flow

class TokenRefreshUseCase @Inject constructor(
    private val authRepository: AuthRepository
) {
    suspend operator fun invoke(refreshToken: String) : Flow<Unit> =
        authRepository.tokenRefresh(refreshToken = refreshToken)
}