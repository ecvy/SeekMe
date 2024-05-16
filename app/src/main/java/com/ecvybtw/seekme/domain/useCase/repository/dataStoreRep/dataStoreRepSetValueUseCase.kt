package com.ecvybtw.seekme.domain.useCase.repository.dataStoreRep

import com.ecvybtw.seekme.domain.repository.dataStoreRep

class dataStoreRepSetValueUseCase (private val repository: dataStoreRep) {
  suspend operator fun invoke(key: String, value: Boolean) {
    return repository.setValue(key,value)
  }

}