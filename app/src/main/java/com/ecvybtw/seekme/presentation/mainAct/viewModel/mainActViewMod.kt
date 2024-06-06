package com.ecvybtw.seekme.presentation.mainAct.viewModel

import androidx.lifecycle.ViewModel
import com.ecvybtw.seekme.domain.useCase.repository.dataStoreRep.store.onBoarding.IsOnBoardingPassedGetUseCase
import com.ecvybtw.seekme.domain.useCase.repository.dataStoreRep.store.onBoarding.isOnboardingPassedSetUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class mainActViewMod @Inject constructor (
  private val isOnBoardingPassedGetUseCase: IsOnBoardingPassedGetUseCase,
  private val isOnboardingPassedSetUseCase: isOnboardingPassedSetUseCase
): ViewModel(){
}