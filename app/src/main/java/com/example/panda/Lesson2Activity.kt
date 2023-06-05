package com.example.panda

import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.core.widget.addTextChangedListener

class Lesson2Activity : AppCompatActivity() {
    lateinit var text: EditText
    lateinit var btn: Button
    var preff: SharedPreferences?= null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lesson2)

        preff = getSharedPreferences("TABLEE", MODE_PRIVATE)
        text = findViewById(R.id.editTextText)
        btn = findViewById(R.id.btn)


        text.addTextChangedListener {
            editContent()
        }
    }
    fun addData()
    {
        val editor = preff?.edit()
        editor?.putInt("bb", (preff?.getInt("bb", 0)!! + 1))
        editor?.apply()
    }
    private fun editContent() {
        if (text.text.toString().isNotEmpty()) {
            btn.setBackgroundResource(R.drawable.btn)
            btn.isClickable = true
        } else {
            btn.setBackgroundResource(R.drawable.btn2)
            btn.isClickable = false
        }
    }

    fun go(view: View) {
        if (text.text.toString() == "Они видят женщину") {
            addData()
            val intent = Intent(this, Lesson3Activity::class.java)
            startActivity(intent)
        } else {
            Toast.makeText(this, "Ошибка!", Toast.LENGTH_SHORT).show()
            val intent = Intent(this, Lesson3Activity::class.java)
            startActivity(intent)
        }
    }

}