package com.example.panda

import android.annotation.SuppressLint
import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.widget.Toolbar
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class MainScreenActivity : AppCompatActivity() {
    lateinit var tl: TabLayout
    lateinit var vp: ViewPager2
    lateinit var hello: TextView
    private val fraglist = listOf(Fragment1(), Fragment2(), Fragment3())
    private val tabicon = listOf(R.drawable.icon1, R.drawable.icon2, R.drawable.icon3)
    var preff: SharedPreferences?= null


    lateinit var tb: Toolbar
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_screen)

        preff = getSharedPreferences("TABLEE", MODE_PRIVATE)

        tl = findViewById(R.id.tabLayout)
        vp = findViewById(R.id.fragmentHolder)
        val adapter = viewadapter(this, fraglist)
        vp.adapter = adapter

        //supportFragmentManager.beginTransaction().replace(R.id.fragmentHolder,fraglist[2]).commit()

        TabLayoutMediator(tl, vp) { tab, pos ->
            tab.setIcon(tabicon[pos])


        }.attach()
        var bool =true
        var bool2 =true

        tb = findViewById(R.id.toolbar)
        setSupportActionBar(this.tb)
        supportActionBar?.setDisplayHomeAsUpEnabled(false) // back
        supportActionBar?.title="Алфавит"

        tl.addOnTabSelectedListener(object : TabLayout.OnTabSelectedListener {
            override fun onTabReselected(tab: TabLayout.Tab?) {
                //when (tab?.position) {
//
                //    0 -> {supportActionBar?.title="Алфавит"
                //        val alphabet_res:RecyclerView = findViewById(R.id.rec_view)
                //        alphabet_res.adapter = Аlphabet_adapter(this@MainScreenActivity, АlphabetList().list)
                //    }
                //    1 -> {supportActionBar?.title="Меню"
                //        hello = findViewById(R.id.hello)
                //        hello.text = ("Привет, " + preff?.getString("name", "") + "!")
                //    }
                //    2 -> {supportActionBar?.title="Профиль"
//
                //    }
                //}
            }

            override fun onTabUnselected(tab: TabLayout.Tab?) {
                //when (tab?.position) {
                //    //[p0 -> {supportActionBar?.title="Профиль"}
                //    //[p1 -> {supportActionBar?.title="Алфавит"
                //    //[p    val alphabet_res:RecyclerView = findViewById(R.id.rec_view)
                //    //[p    alphabet_res.adapter = Аlphabet_adapter(this@MainScreenActivity, АlphabetList().list)}
                //    //[p2 -> {supportActionBar?.title="Меню"}
                //}

            }

            override fun onTabSelected(tab: TabLayout.Tab?) {
                when (tab?.position) {

                    0 -> {supportActionBar?.title="Алфавит"
                        if (bool){
                            val alphabet_res:RecyclerView = findViewById(R.id.rec_view)
                            alphabet_res.adapter = Аlphabet_adapter(this@MainScreenActivity, АlphabetList().list)
                            bool =false
                        }

                    }
                    1 -> {supportActionBar?.title="Меню"

                        if (bool2) {
                            hello = findViewById(R.id.hello)
                            hello.text = ("Привет, " + preff?.getString("name", "") + "!")
                            bool2 =false
                        }
                    }
                    2 -> {supportActionBar?.title="Профиль"

                    }
                }
            }
        })



    }
    fun lesson(view: View) {
        val intent = Intent(this, LessonActivity::class.java)
        startActivity(intent)
    }
    fun test(view: View) {
        val intent = Intent(this, TestActivity::class.java)
        startActivity(intent)
    }
}