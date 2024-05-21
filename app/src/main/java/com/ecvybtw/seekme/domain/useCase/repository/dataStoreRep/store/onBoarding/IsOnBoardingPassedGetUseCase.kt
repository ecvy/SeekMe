package com.ecvybtw.seekme.domain.useCase.repository.dataStoreRep.store.onBoarding

import com.ecvybtw.seekme.domain.useCase.repository.dataStoreRep.dataStoreRepGetValueUseCase
import com.ecvybtw.seekme.domain.useCase.repository.dataStoreRep.store.dataStoreKeys
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Inject


class IsOnBoardingPassedGetUseCase
  (private val dataStoreRepGetValueUseCase: dataStoreRepGetValueUseCase) {
  suspend operator fun invoke(): Boolean {
    return dataStoreRepGetValueUseCase(dataStoreKeys.isOnboardingPassed) ?: false
  }
}