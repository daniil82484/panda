package com.example.panda

import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.core.widget.addTextChangedListener

class SigninActivity : AppCompatActivity() {
    lateinit var name: EditText
    var preff: SharedPreferences?= null
    lateinit var btn: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signin)

        name = findViewById(R.id.name)
        btn = findViewById(R.id.button)

        preff = getSharedPreferences("TABLEE", MODE_PRIVATE)
        name.addTextChangedListener {
            editContent()
        }
    }
    private fun editContent() {
        if (name.text.toString().isNotEmpty())
        {
            btn.setBackgroundResource(R.drawable.btn)
            btn.isClickable = true
        }
        else
        {
            btn.setBackgroundResource(R.drawable.btn2)
            btn.isClickable = false
        }
    }

    fun saveData(name:String)
    {
        val editor = preff?.edit()
        editor?.putString("name", name)
        editor?.apply()
    }
    fun login(){
        val value:String = name.text.toString()
        saveData(value)

        val intent = Intent(this@SigninActivity, MainScreenActivity::class.java)
        startActivity(intent)
    }

}