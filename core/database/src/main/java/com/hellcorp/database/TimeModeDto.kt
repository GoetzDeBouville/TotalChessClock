package com.hellcorp.database

data class TimeModeDto(
    val name: String,
    val timeFirstPlayerMs: Long,
    val incrementFirstPlayerMs: Long = 0L,
    val timeSecondPlayerMs: Long = timeFirstPlayerMs,
    val incrementSecondPlayerMs: Long = 0L
)