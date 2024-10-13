package com.example.pemrograman_bergerak

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class SuratSelesaiActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_suratselesai)

        val ButtonL = findViewById<Button>(R.id.buttonB1)

        ButtonL.setOnClickListener {
            val intent = Intent(this@SuratSelesaiActivity, TranskripNilaiActivity::class.java)
            startActivity(intent)
        }

    }
}