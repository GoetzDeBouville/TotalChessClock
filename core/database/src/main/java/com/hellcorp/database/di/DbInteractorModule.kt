package com.hellcorp.database.di

import com.hellcorp.database.domain.TimeModeDbInteractor
import com.hellcorp.database.domain.TimeModeDbInteractorImpl
import com.hellcorp.database.domain.TimeModeDbRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent

@Module
@InstallIn(ViewModelComponent::class)
class DbInteractorModule {

    @Provides
    fun provideTimeModeInteractor(repo: TimeModeDbRepository): TimeModeDbInteractor =
        TimeModeDbInteractorImpl(repo)
}