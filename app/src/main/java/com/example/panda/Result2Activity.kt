package com.example.panda

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.MediaController
import android.widget.VideoView

class Result2Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result2)

        val video:VideoView=findViewById(R.id.videoView)
        val mediaController= MediaController(this)
        mediaController.setAnchorView(video)
        val onLine = Uri.parse("android.resource://$packageName/${R.raw.klaus2}")
        video.setMediaController(mediaController)
        video.setVideoURI(onLine)
        video.requestFocus()
        video.start()
    }

    fun back(view: View) {
        intent = Intent(this, MainScreenActivity::class.java)
        startActivity(intent)
        finish()
    }
}