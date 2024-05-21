package com.ecvybtw.seekme.domain.modules

import android.content.Context
import com.ecvybtw.seekme.data.impl.dataStoreRepImpl
import com.ecvybtw.seekme.domain.repository.dataStoreRep
import com.ecvybtw.seekme.domain.useCase.repository.dataStoreRep.dataStoreRepGetValueUseCase
import com.ecvybtw.seekme.domain.useCase.repository.dataStoreRep.dataStoreRepSetValueUseCase
import com.ecvybtw.seekme.domain.useCase.repository.dataStoreRep.store.onBoarding.IsOnBoardingPassedGetUseCase
import com.ecvybtw.seekme.domain.useCase.repository.dataStoreRep.store.onBoarding.isOnboardingPassedSetUseCase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class dataStoreModule {
  @Provides
  @Singleton
  fun provideDataStoreRep(@ApplicationContext context: Context): dataStoreRep{
    return dataStoreRepImpl(context)
  }
  @Provides
  @Singleton
  fun provideDataStoreRepositoryGetValueUseCase(
    dataStoreRepository: dataStoreRep
  ): dataStoreRepGetValueUseCase {
    return dataStoreRepGetValueUseCase(dataStoreRepository)
  }

  @Provides
  @Singleton
  fun provideDataStoreRepositorySetValueUseCase(
    dataStoreRepository: dataStoreRep
  ): dataStoreRepSetValueUseCase {
    return dataStoreRepSetValueUseCase(dataStoreRepository)
  }

  @Provides
  @Singleton
  fun provideIsOnboardingPassedGetUseCase(
    dataStoreRepositoryGetValueUseCase: dataStoreRepGetValueUseCase
  ): IsOnBoardingPassedGetUseCase {
    return IsOnBoardingPassedGetUseCase(dataStoreRepositoryGetValueUseCase)
  }

  @Provides
  @Singleton
  fun provideIsOnboardingPassedSetUseCase(
    dataStoreRepositorySetValueUseCase: dataStoreRepSetValueUseCase
  ): isOnboardingPassedSetUseCase {
    return isOnboardingPassedSetUseCase(dataStoreRepositorySetValueUseCase)
  }
}