package com.ecvybtw.seekme.domain.useCase.repository.dataStoreRep.store.onBoarding

import com.ecvybtw.seekme.domain.useCase.repository.dataStoreRep.dataStoreRepGetValueUseCase
import com.ecvybtw.seekme.domain.useCase.repository.dataStoreRep.store.dataStoreKeys

class IsOnBoardingPassedGetUseCase
  (private val dataStoreRepGetValueUseCase: dataStoreRepGetValueUseCase) {
    suspend operator fun invoke(): Boolean {
     return dataStoreRepGetValueUseCase(dataStoreKeys.isOnboardingPassed) ?: false
    }
}