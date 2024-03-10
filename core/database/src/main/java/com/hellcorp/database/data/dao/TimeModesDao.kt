package com.hellcorp.database.data.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Query
import androidx.room.Upsert
import com.hellcorp.database.data.entity.TimeModeEntity
import kotlinx.coroutines.flow.Flow

@Dao
interface TimeModesDao {
    @Upsert
    suspend fun upsertTimeMode(data: TimeModeEntity)

    @Delete
    suspend fun removeTimeMode(data: TimeModeEntity)

    @Query("SELECT * FROM time_mode_table ORDER BY timeFirstPlayerMs")
    suspend fun getTimeModeList(): Flow<List<TimeModeEntity>>
}