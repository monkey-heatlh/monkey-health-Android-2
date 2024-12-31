package com.example.domain.usecase.routine

import com.example.domain.model.routine.request.PostRoutineModel
import com.example.domain.repository.RoutineRepository
import javax.inject.Inject

class GetRoutine @Inject constructor(
    private val RoutineRepository: RoutineRepository
) {
    suspend operator fun invoke(body: PostRoutineModel) =
        PostRoutineModel.post(body = body)
}
