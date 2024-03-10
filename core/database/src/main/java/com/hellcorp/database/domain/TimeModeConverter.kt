package com.hellcorp.database.domain

import com.hellcorp.database.data.entity.TimeModeEntity
import com.hellcorp.database.domain.models.TimeMode

interface TimeModeConverter {
    fun map(timer: TimeModeEntity): TimeMode
    fun map(timer: TimeMode): TimeModeEntity
}