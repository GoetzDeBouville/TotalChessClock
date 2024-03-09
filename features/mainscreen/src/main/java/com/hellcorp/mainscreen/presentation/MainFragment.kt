package com.hellcorp.mainscreen.presentation

import androidx.fragment.app.viewModels
import com.google.android.material.tabs.TabLayoutMediator
import com.hellcorp.mainscreen.databinding.FragmentMainBinding
import com.hellcorp.mainscreen.presentation.adapters.ViewPagerAdapter
import com.hellcorp.mainscreen.presentation.basemodes.BaseModesFragment
import com.hellcorp.mainscreen.presentation.usersmodes.UsersModesFragment
import com.hellcorp.ui.BaseFragment

class MainFragment : BaseFragment<FragmentMainBinding, MainViewModel>(FragmentMainBinding::inflate) {
    override val viewModel by viewModels<MainViewModel>()
    override fun initViews() {
        initViewPager()
    }

    override fun subscribe() {
    }

    private fun initViewPager() = with(binding) {
        viewpager.adapter = ViewPagerAdapter(
            listOf(BaseModesFragment(), UsersModesFragment()),
            childFragmentManager,
            viewLifecycleOwner.lifecycle
        )

        TabLayoutMediator(tabLayout, viewpager) { tab, position ->
            tab.text = when(position) {
                0 -> "Basic"
                1 -> "Custom"
                else -> ""
            }
        }.attach()
    }
}