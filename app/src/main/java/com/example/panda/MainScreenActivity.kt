package com.example.panda

import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class MainScreenActivity : AppCompatActivity() {
    lateinit var tl: TabLayout
    lateinit var vp: ViewPager2
    private val fraglist = listOf(Fragment1(), Fragment2(), Fragment3())
    private val tabicon = listOf(R.drawable.icon1, R.drawable.icon2, R.drawable.icon3)
    var preff: SharedPreferences?= null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_screen)

        preff = getSharedPreferences("TABLEE", MODE_PRIVATE)

        tl = findViewById(R.id.tabLayout)
        vp = findViewById(R.id.fragmentHolder)
        val adapter = viewadapter(this, fraglist)
        vp.adapter = adapter
        TabLayoutMediator(tl, vp) { tab, pos ->
            tab.setIcon(tabicon[pos])
        }.attach()

        //tl.addOnTabSelectedListener(object : TabLayout.OnTabSelectedListener {
        //    override fun onTabReselected(tab: TabLayout.Tab?) {
        //    }
        //
        //    override fun onTabUnselected(tab: TabLayout.Tab?) {
        //        when (tab?.position) {
        //            0 -> {tab.setIcon(R.drawable.icon1)}
        //            1 -> {tab.setIcon(R.drawable.icon1)}
        //            2 -> {tab.setIcon(R.drawable.icon1)}
        //        }
        //
        //    }
        //
        //    override fun onTabSelected(tab: TabLayout.Tab?) {
        //        when (tab?.position) {
        //            0 -> {tab.setIcon(R.drawable.icon2)}
        //            1 -> {tab.setIcon(R.drawable.icon2)}
        //            2 -> {tab.setIcon(R.drawable.icon2)}
        //        }
        //    }
//
        //})

    }

}