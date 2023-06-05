package com.example.panda

import android.annotation.SuppressLint
import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.widget.Toolbar
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class MainScreenActivity : AppCompatActivity() {

    var preff: SharedPreferences?= null


    lateinit var tb: Toolbar
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_screen)

        preff = getSharedPreferences("TABLEE", MODE_PRIVATE)


        //supportFragmentManager.beginTransaction().replace(R.id.fragmentHolder,fraglist[2]).commit()

        tb = findViewById(R.id.toolbar)
        setSupportActionBar(this.tb)
        supportActionBar?.setDisplayHomeAsUpEnabled(false) // back
        supportActionBar?.title="Алфавит"




    }
    fun lesson(view: View) {
        val intent = Intent(this, LessonActivity::class.java)
        startActivity(intent)
    }
    fun test(view: View) {
        val intent = Intent(this, TestActivity::class.java)
        startActivity(intent)
    }

    fun alphabet(view: View) {
        val intent = Intent(this, AlphabetActivity::class.java)
        startActivity(intent)
    }

    fun profile(view: View) {
        val intent = Intent(this, ProfileActivity::class.java)
        startActivity(intent)
    }
}