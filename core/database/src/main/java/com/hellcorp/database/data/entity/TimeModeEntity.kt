package com.hellcorp.database.data.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "time_mode_table")
data class TimeModeEntity(
    @PrimaryKey @ColumnInfo(name = "time_mode_id")
    val id: Int,
    @ColumnInfo(name = "title", typeAffinity = ColumnInfo.TEXT)
    val name: String,
    val timeFirstPlayerMs: Long,
    val incrementFirstPlayerMs: Long = 0L,
    val timeSecondPlayerMs: Long = timeFirstPlayerMs,
    val incrementSecondPlayerMs: Long = 0L
)