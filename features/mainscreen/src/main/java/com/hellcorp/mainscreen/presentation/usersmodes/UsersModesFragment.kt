package com.hellcorp.mainscreen.presentation.usersmodes

import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.LinearLayoutManager
import com.hellcorp.database.TimeModeEntity
import com.hellcorp.mainscreen.databinding.FragmentUsersModesBinding
import com.hellcorp.mainscreen.presentation.adapters.TimeModeAdapter
import com.hellcorp.ui.BaseFragment

class UsersModesFragment :
    BaseFragment<FragmentUsersModesBinding, UsersModesViewModel>(FragmentUsersModesBinding::inflate) {
    override val viewModel by viewModels<UsersModesViewModel>()
    private val adapter = TimeModeAdapter()

    override fun initViews() {
        val itemModeList: ArrayList<TimeModeEntity> = arrayListOf()
        adapter.setItemList(itemModeList)
        binding.rvItemlist.adapter = adapter
        binding.rvItemlist.layoutManager = LinearLayoutManager(requireContext())
    }

    override fun subscribe() {
    }
}