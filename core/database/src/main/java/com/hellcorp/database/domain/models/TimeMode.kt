package com.hellcorp.database.domain.models

import java.text.SimpleDateFormat

data class TimeMode(
    val id: Int,
    val name: String,
    val timeFirstPlayerMs: Long,
    val incrementFirstPlayerMs: Long = 0L,
    val timeSecondPlayerMs: Long = timeFirstPlayerMs,
    val incrementSecondPlayerMs: Long = 0L
) {
    fun buildTimeString(): String {
        val firstPlayerTime = formatTime(timeFirstPlayerMs)
        val secondPlayerTime = if (timeFirstPlayerMs != timeSecondPlayerMs) {
            " | ${formatTime(timeSecondPlayerMs)}"
        } else {
            ""
        }
        val firstPlayerIncrement = if (incrementFirstPlayerMs > 0L) {
            " + ${incrementFirstPlayerMs / 1000}"
        } else {
            ""
        }
        val secondPlayerIncrement = if (incrementSecondPlayerMs > 0L) {
            " + ${incrementSecondPlayerMs / 1000}"
        } else {
            ""
        }
        return "$firstPlayerTime$firstPlayerIncrement$secondPlayerTime$secondPlayerIncrement"
    }
    private fun formatTime(ms: Long): String {
        val format = if (ms / 1000 > SEC_IN_HOUR) {
            SimpleDateFormat("hh:mm:ss")
        } else {
            SimpleDateFormat("mm:ss")
        }
        return format.format(ms)
    }

    private companion object {
        const val SEC_IN_HOUR = 3600L
    }
}
