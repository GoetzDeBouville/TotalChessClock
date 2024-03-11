package com.hellcorp.database.data

import com.hellcorp.database.AppDatabase
import com.hellcorp.database.domain.TimeModeConverter
import com.hellcorp.database.domain.TimeModeDbRepository
import com.hellcorp.database.domain.models.TimeMode
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.withContext

class TimeModeDbRepositoryImpl(
    private val database: AppDatabase,
    private val converter: TimeModeConverter
) : TimeModeDbRepository {
    override suspend fun upsertTimeMode(data: TimeMode) {
        withContext(Dispatchers.IO) {
            database.timeModeDao().upsertTimeMode(converter.map(data))
        }
    }

    override suspend fun removeTimeMode(data: TimeMode) {
        withContext(Dispatchers.IO) {
            database.timeModeDao().removeTimeMode(converter.map(data))
        }
    }

    override suspend fun getTimeModeList(): Flow<List<TimeMode>> {
        return withContext(Dispatchers.IO) {
            database.timeModeDao().getTimeModeList().map { list ->
                list.map { entity ->
                    converter.map(entity)
                }
            }
        }
    }
}