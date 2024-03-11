package com.hellcorp.database.di

import com.hellcorp.database.AppDatabase
import com.hellcorp.database.data.TimeModeConverterImpl
import com.hellcorp.database.data.TimeModeDbRepositoryImpl
import com.hellcorp.database.domain.TimeModeConverter
import com.hellcorp.database.domain.TimeModeDbRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
class DbRepositoryModule {
    @Provides
    fun provideConverter(): TimeModeConverter = TimeModeConverterImpl()

    @Provides
    fun provideTimeModeRepository(
        db: AppDatabase,
        converter: TimeModeConverter
    ): TimeModeDbRepository = TimeModeDbRepositoryImpl(db, converter)
}