package com.hellcorp.database.domain

import com.hellcorp.database.domain.models.TimeMode
import kotlinx.coroutines.flow.Flow

class TimeModeDbInteractorImpl(
    private val repository: TimeModeDbRepository
): TimeModeDbInteractor {
    override suspend fun upsertTimeMode(data: TimeMode) {
        repository.upsertTimeMode(data)
    }

    override suspend fun removeTimeMode(data: TimeMode) {
        repository.removeTimeMode(data)
    }

    override suspend fun getTimeModeList(): Flow<List<TimeMode>> {
        return repository.getTimeModeList()
    }
}