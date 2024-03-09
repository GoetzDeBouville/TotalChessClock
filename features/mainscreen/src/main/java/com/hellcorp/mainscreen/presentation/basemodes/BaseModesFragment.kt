package com.hellcorp.mainscreen.presentation.basemodes

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import com.hellcorp.mainscreen.R
import com.hellcorp.mainscreen.databinding.FragmentBaseModesBinding
import com.hellcorp.ui.BaseFragment

class BaseModesFragment : BaseFragment<FragmentBaseModesBinding, BaseModesViewModel>(FragmentBaseModesBinding::inflate) {
    override val viewModel by viewModels<BaseModesViewModel>()
    override fun initViews() {
    }

    override fun subscribe() {
    }
}