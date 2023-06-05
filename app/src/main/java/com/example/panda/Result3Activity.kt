package com.example.panda

import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class Result3Activity : AppCompatActivity() {
    lateinit var text: TextView
    var preff: SharedPreferences?= null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result3)

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