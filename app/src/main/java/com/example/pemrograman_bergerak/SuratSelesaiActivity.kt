package com.example.pemrograman_bergerak

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class SuratSelesaiActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_suratselesai)

        val ButtonL = findViewById<Button>(R.id.buttonB1)

        ButtonL.setOnClickListener {
            val intent = Intent(this@SuratSelesaiActivity, TranskripNilaiActivity::class.java)
            startActivity(intent)
        }

        val ButtonK = findViewById<Button>(R.id.buttonX1)

        ButtonK.setOnClickListener {
            val intent = Intent(this@SuratSelesaiActivity, SurataktifActivity::class.java)
            startActivity(intent)
        }

        val ImageButton1 = findViewById<ImageButton>(R.id.back)

        ImageButton1.setOnClickListener {
            val intent = Intent(this@SuratSelesaiActivity, Home2Activity::class.java)
            startActivity(intent)
        }

    }
}