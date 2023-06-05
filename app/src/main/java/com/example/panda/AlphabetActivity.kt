package com.example.panda

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.widget.Toolbar
import androidx.recyclerview.widget.RecyclerView

class AlphabetActivity : AppCompatActivity() {
    lateinit var tb: Toolbar
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_alphabet)

        tb = findViewById(R.id.toolbar)
        setSupportActionBar(this.tb)
        supportActionBar?.setDisplayHomeAsUpEnabled(true) // back
        supportActionBar?.title="Алфавит"

        val poster_res: RecyclerView = findViewById(R.id.rec_view)
        poster_res.adapter = Аlphabet_adapter(this, АlphabetList().list)

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