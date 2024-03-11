package com.hellcorp.database.data

import com.hellcorp.database.data.entity.TimeModeEntity
import com.hellcorp.database.domain.TimeModeConverter
import com.hellcorp.database.domain.models.TimeMode

class TimeModeConverterImpl : TimeModeConverter {
    override fun map(timer: TimeModeEntity): TimeMode {
        with(timer) {
            return TimeMode(
                id = id,
                name = name,
                timeFirstPlayerMs = timeFirstPlayerMs,
                incrementFirstPlayerMs = incrementFirstPlayerMs,
                timeSecondPlayerMs = timeSecondPlayerMs,
                incrementSecondPlayerMs = incrementSecondPlayerMs
            )
        }
    }

    override fun map(timer: TimeMode): TimeModeEntity {
        with(timer) {
            return TimeModeEntity(
                id = id,
                name = name,
                timeFirstPlayerMs = timeFirstPlayerMs,
                incrementFirstPlayerMs = incrementFirstPlayerMs,
                timeSecondPlayerMs = timeSecondPlayerMs,
                incrementSecondPlayerMs = incrementSecondPlayerMs
            )
        }
    }
}