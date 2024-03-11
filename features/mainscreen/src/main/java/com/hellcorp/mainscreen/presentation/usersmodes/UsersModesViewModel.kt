package com.hellcorp.mainscreen.presentation.usersmodes

import androidx.lifecycle.ViewModel
import com.hellcorp.database.domain.TimeModeDbInteractor
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class UsersModesViewModel @Inject constructor(
    private val interactor: TimeModeDbInteractor
) : ViewModel()