package com.ecvybtw.seekme.domain.useCase.repository.dataStoreRep.store.onBoarding

import com.ecvybtw.seekme.domain.useCase.repository.dataStoreRep.dataStoreRepSetValueUseCase
import com.ecvybtw.seekme.domain.useCase.repository.dataStoreRep.store.dataStoreKeys
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Inject


class isOnboardingPassedSetUseCase(
  private val dataStoreRepSetValueUseCase: dataStoreRepSetValueUseCase
) {
  suspend operator fun invoke() {
    dataStoreRepSetValueUseCase(dataStoreKeys.isOnboardingPassed, true)
  }
}