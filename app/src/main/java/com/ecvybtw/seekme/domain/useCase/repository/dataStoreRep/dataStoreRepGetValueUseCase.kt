package com.ecvybtw.seekme.domain.useCase.repository.dataStoreRep

import com.ecvybtw.seekme.domain.repository.dataStoreRep

class dataStoreRepGetValueUseCase (private val repository: dataStoreRep){
  suspend operator fun invoke(key: String): Boolean? {
    return repository.getValue(key)
  }
}