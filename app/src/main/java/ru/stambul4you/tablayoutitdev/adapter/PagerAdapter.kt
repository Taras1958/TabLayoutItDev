package ru.stambul4you.tablayoutitdev.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import ru.stambul4you.tablayoutitdev.screens.FirstFragment
import ru.stambul4you.tablayoutitdev.screens.SecondFragment
import ru.stambul4you.tablayoutitdev.screens.ThreeFragment

class PagerAdapter(fragmentActivity: FragmentActivity):FragmentStateAdapter(fragmentActivity) {
    override fun getItemCount(): Int {
            return 3
    }

    override fun createFragment(position: Int): Fragment {
            return when(position) {
                0 -> FirstFragment()
                1 -> SecondFragment()
                else -> ThreeFragment()
            }
    }
}