package com.example.panda

import android.content.Intent
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
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lesson2)

        text = findViewById(R.id.editTextText)
        btn = findViewById(R.id.btn)


        text.addTextChangedListener {
            editContent()
        }
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
        if (text.text.toString() == "123") {
            val intent = Intent(this, ResultActivity::class.java)
            startActivity(intent)
        } else {
            Toast.makeText(this, "Ошибка!", Toast.LENGTH_SHORT).show()
        }
    }
}