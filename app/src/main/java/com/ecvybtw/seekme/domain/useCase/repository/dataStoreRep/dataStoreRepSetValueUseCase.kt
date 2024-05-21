package com.ecvybtw.seekme.domain.useCase.repository.dataStoreRep

import com.ecvybtw.seekme.domain.repository.dataStoreRep
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Inject


class dataStoreRepSetValueUseCase (private val repository: dataStoreRep) {
  suspend operator fun invoke(key: String, value: Boolean) {
    return repository.setValue(key,value)
  }

}