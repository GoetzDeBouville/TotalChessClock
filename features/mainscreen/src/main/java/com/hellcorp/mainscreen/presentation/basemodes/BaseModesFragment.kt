package com.hellcorp.mainscreen.presentation.basemodes

import androidx.fragment.app.viewModels
import com.hellcorp.mainscreen.databinding.FragmentBaseModesBinding
import com.hellcorp.ui.BaseFragment
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class BaseModesFragment :
    BaseFragment<FragmentBaseModesBinding, BaseModesViewModel>(FragmentBaseModesBinding::inflate) {
    override val viewModel by viewModels<BaseModesViewModel>()
    override fun initViews() = Unit

    override fun subscribe() = Unit
}