package com.example.pemrograman_bergerak

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class TranskripNilaiActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_transkripnilai)

        val Button1 = findViewById<ImageButton>(R.id.ButtonImageB8)

        Button1.setOnClickListener {
            val intent = Intent(this@TranskripNilaiActivity, Home2Activity::class.java)
            startActivity(intent)
        }
    }
}