package com.hellcorp.mainscreen.presentation

import androidx.fragment.app.viewModels
import com.hellcorp.mainscreen.databinding.FragmentMainBinding
import com.hellcorp.ui.BaseFragment

class MainFragment : BaseFragment<FragmentMainBinding, MainViewModel>(FragmentMainBinding::inflate) {
    override val viewModel by viewModels<MainViewModel>()
    override fun initViews() {
    }

    override fun subscribe() {
    }
}