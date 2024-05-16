package com.ecvybtw.seekme.domain.repository;

 interface dataStoreRep {
  suspend fun setValue(key: String, value: Boolean)
  suspend fun getValue(key: String): Boolean?
}