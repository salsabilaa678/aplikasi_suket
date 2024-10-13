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

class SurataktifActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_surataktif)

        val DaftarButton1 = findViewById<Button>(R.id.buttonW1)

        DaftarButton1.setOnClickListener {
            val intent = Intent(this@SurataktifActivity, FormuliraktifActivity::class.java)
            startActivity(intent)
        }
        val ImageButton1 = findViewById<ImageButton>(R.id.back)

        ImageButton1.setOnClickListener {
            val intent = Intent(this@SurataktifActivity, Home2Activity::class.java)
            startActivity(intent)
        }

    }
}