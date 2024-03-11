package com.hellcorp.database.domain

import com.hellcorp.database.data.entity.TimeModeEntity
import com.hellcorp.database.domain.models.TimeMode
import kotlinx.coroutines.flow.Flow

interface TimeModeDbInteractor {
    suspend fun upsertTimeMode(data: TimeMode)
    suspend fun removeTimeMode(data: TimeMode)
    suspend fun getTimeModeList(): Flow<List<TimeMode>>
}