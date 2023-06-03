package com.example.panda

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.core.widget.addTextChangedListener
import kotlin.properties.Delegates

class TestActivity : AppCompatActivity() {
    lateinit var btn_var1: Button
    lateinit var btn_var2: Button
    lateinit var btn_var3: Button
    lateinit var btn_var4: Button
    lateinit var btn: Button
    var a by Delegates.notNull<Int>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test)
        btn = findViewById(R.id.btn)
        btn_var1 = findViewById(R.id.btn_var1)
        btn_var2 = findViewById(R.id.btn_var2)
        btn_var3 = findViewById(R.id.btn_var3)
        btn_var4 = findViewById(R.id.btn_var4)
        a=1
    }

    fun go(view: View) {
        btn_var2.setBackgroundResource(R.drawable.btn3_1)
        btn_var3.setBackgroundResource(R.drawable.btn3_1)
        btn_var4.setBackgroundResource(R.drawable.btn3_1)
        btn.setBackgroundResource(R.drawable.btn)
        btn.text = "Назад"
        btn.isClickable = true
        btn_var1.isClickable = false
        a=1
    }
    fun go2(view: View) {
        btn_var1.setBackgroundResource(R.drawable.btn3_2)
        btn.setBackgroundResource(R.drawable.btn)
        btn_var2.isClickable = false
        btn_var3.isClickable = false
        btn_var4.isClickable = false
        btn.isClickable = true
        a=2
    }
    fun go3(view: View) {
        if (a==2){
            intent = Intent(this, Test2Activity::class.java)
        }
        if (a==1){
            intent = Intent(this, MainScreenActivity::class.java)
        }
        startActivity(intent)
        finish()
    }
}