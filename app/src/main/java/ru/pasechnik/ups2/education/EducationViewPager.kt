package ru.pasechnik.ups2.education

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter

class EducationViewPagerAdapter(
    private val fragments: ArrayList<Fragment>,
    lifecycle: Lifecycle,
    fm: FragmentManager
) : FragmentStateAdapter(fm, lifecycle) {

    override fun getItemCount() =
        fragments.size

    override fun createFragment(position: Int) =
        fragments[position]

}