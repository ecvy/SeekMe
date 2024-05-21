package com.ecvybtw.seekme.data.impl

import android.content.Context
import androidx.datastore.core.DataStore
import androidx.datastore.preferences.core.Preferences
import androidx.datastore.preferences.core.booleanPreferencesKey
import androidx.datastore.preferences.core.edit
import androidx.datastore.preferences.preferencesDataStore
import com.ecvybtw.seekme.domain.repository.dataStoreRep
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import kotlinx.coroutines.flow.first
import kotlinx.coroutines.flow.map
import javax.inject.Inject
import javax.inject.Singleton

class dataStoreRepImpl(private val context: Context) :
  dataStoreRep {
  private val Context.dataStore: DataStore<Preferences> by preferencesDataStore("settings")
  override suspend fun setValue(key: String, value: Boolean) {
    val preferencesKey = booleanPreferencesKey("key")

    context.dataStore.edit { preferences ->
      preferences[preferencesKey] = value
    }
  }

  override suspend fun getValue(key: String): Boolean? {
    val preferencesKey = booleanPreferencesKey("key")

    return context.dataStore.data.map { preferences ->
      preferences[preferencesKey]
    }.first()
  }
}