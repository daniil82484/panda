package com.example.panda

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.bottomnavigation.BottomNavigationView

class ProfileActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        val poster_res: RecyclerView = findViewById(R.id.rec_view)
        poster_res.adapter = Friends_adapter(this, FriendsList().list)

        val poster_res2: RecyclerView = findViewById(R.id.rec_view2)
        poster_res2.adapter = Achievements_adapter(this, AchievementstList().list)
    }
}