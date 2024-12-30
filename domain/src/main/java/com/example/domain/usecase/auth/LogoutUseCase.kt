package com.example.domain.usecase.auth

import com.example.domain.model.auth.request.LoginRequestModel
import com.example.domain.model.auth.response.LoginResponseModel
import com.example.domain.repository.AuthRepository
import java.util.concurrent.Flow
import javax.inject.Inject

class LogoutUseCase @Inject constructor(
    private val authRepository: AuthRepository
) {
    suspend operator fun invoke(body: LoginRequestModel) =
        authRepository.login(body = body)
}
