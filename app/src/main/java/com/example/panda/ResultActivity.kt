package com.example.panda

import android.content.Intent
import android.content.SharedPreferences
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.MediaController
import android.widget.TextView
import android.widget.VideoView

class ResultActivity : AppCompatActivity() {
    lateinit var text: TextView
    var preff: SharedPreferences?= null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        val video:VideoView=findViewById(R.id.videoView)
        val mediaController= MediaController(this)
        mediaController.setAnchorView(video)
        val onLine = Uri.parse("android.resource://$packageName/${R.raw.klaus2}")
        video.setMediaController(mediaController)
        video.setVideoURI(onLine)
        video.requestFocus()
        video.start()


        preff = getSharedPreferences("TABLEE", MODE_PRIVATE)
        text = findViewById(R.id.textView5)
        text.text = preff?.getInt("bb", 0).toString() + " / 3"
    }

    fun back(view: View) {
        intent = Intent(this, MainScreenActivity::class.java)
        startActivity(intent)
        finish()
    }
}