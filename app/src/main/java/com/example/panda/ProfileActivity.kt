package com.example.panda

import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.widget.Toolbar
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.bottomnavigation.BottomNavigationView

class ProfileActivity : AppCompatActivity() {
    lateinit var text: TextView
    var preff: SharedPreferences?= null
    lateinit var tb: Toolbar
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        preff = getSharedPreferences("TABLEE", MODE_PRIVATE)

        tb = findViewById(R.id.toolbar)
        setSupportActionBar(this.tb)
        supportActionBar?.setDisplayHomeAsUpEnabled(true) // back
        supportActionBar?.title="Профиль"

        val poster_res: RecyclerView = findViewById(R.id.rec_view)
        poster_res.adapter = Friends_adapter(this, FriendsList().list)

        val poster_res2: RecyclerView = findViewById(R.id.rec_view2)
        poster_res2.adapter = Achievements_adapter(this, AchievementstList().list)

        text = findViewById(R.id.textView11)
        text.text = preff?.getString("name", "")
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (item.itemId == android.R.id.home)
        {
            val inte = Intent(this, MainScreenActivity::class.java)
            startActivity(inte)
            finish()
        }
        return true
    }
}