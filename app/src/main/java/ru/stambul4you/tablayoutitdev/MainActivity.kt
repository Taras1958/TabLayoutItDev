package ru.stambul4you.tablayoutitdev

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.content.ContextCompat
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator
import ru.stambul4you.tablayoutitdev.adapter.PagerAdapter
import ru.stambul4you.tablayoutitdev.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initial()
    }

    private fun initial() {
       binding.viewPager.adapter = PagerAdapter(this)
        binding.tabLayout.tabIconTint = null

        TabLayoutMediator(binding.tabLayout, binding.viewPager) {
            tab, pos ->
            when(pos) {
                0 -> {
                    tab.setIcon(R.drawable.ic_baseline_campaign_24)
                    tab.icon?.setTint(ContextCompat.getColor(this, R.color.one))
                }

                1 -> {
                    tab.setIcon(R.drawable.ic_baseline_build_24)
                    tab.icon?.setTint(ContextCompat.getColor(this, R.color.two))
                    tab.icon?.alpha = 70
                }

                2 -> {
                    tab.setIcon(R.drawable.ic_baseline_brightness_2_24)
                    tab.icon?.setTint(ContextCompat.getColor(this, R.color.three))
                    tab.icon?.alpha = 70
                }
            }

        }.attach()

        binding.tabLayout.addOnTabSelectedListener(object : TabLayout.OnTabSelectedListener{
            override fun onTabSelected(tab: TabLayout.Tab) {
                tab.icon?.alpha = 250
            }

            override fun onTabUnselected(tab: TabLayout.Tab) {
                tab.icon?.alpha = 70
            }

            override fun onTabReselected(tab: TabLayout.Tab?) {

            }

        })

    }
}