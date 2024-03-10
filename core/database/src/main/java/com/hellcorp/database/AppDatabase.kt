package com.hellcorp.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.hellcorp.database.data.dao.TimeModesDao
import com.hellcorp.database.data.entity.TimeModeEntity

@Database(
    version = 1,
    entities = [TimeModeEntity::class]
)
abstract class AppDatabase : RoomDatabase() {
    abstract fun timeModeDao(): TimeModesDao
}