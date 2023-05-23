package com.example.panda

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class MainScreenActivity : AppCompatActivity() {
    lateinit var tl: TabLayout
    lateinit var vp: ViewPager2
    private val fraglist = listOf(Fragment1(), Fragment2(), Fragment3())
    private val tablist = listOf("1", "2", "3")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_screen)
        tl = findViewById(R.id.tabLayout)
        vp = findViewById(R.id.fragmentHolder)
        val adapter = viewadapter(this, fraglist)
        vp.adapter = adapter
        TabLayoutMediator(tl, vp) { tab, pos ->
            tab.text = tablist[pos]
        }.attach()
    }
}