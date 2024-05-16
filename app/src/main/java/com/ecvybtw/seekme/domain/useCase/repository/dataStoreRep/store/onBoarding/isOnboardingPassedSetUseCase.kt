package com.ecvybtw.seekme.domain.useCase.repository.dataStoreRep.store.onBoarding

import com.ecvybtw.seekme.domain.useCase.repository.dataStoreRep.dataStoreRepSetValueUseCase
import com.ecvybtw.seekme.domain.useCase.repository.dataStoreRep.store.dataStoreKeys

class isOnboardingPassedSetUseCase(
  private val dataStoreRepSetValueUseCase: dataStoreRepSetValueUseCase){
  suspend operator fun invoke(){
    dataStoreRepSetValueUseCase(dataStoreKeys.isOnboardingPassed, true)
  }
}