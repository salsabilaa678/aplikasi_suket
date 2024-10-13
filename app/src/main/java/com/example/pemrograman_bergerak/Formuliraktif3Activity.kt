package com.example.pemrograman_bergerak

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Formuliraktif3Activity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_formuliraktif3)

        val imageButton1 = findViewById<ImageButton>(R.id.back)

        imageButton1.setOnClickListener {
            val intent = Intent(this@Formuliraktif3Activity, Home2Activity::class.java)
            startActivity(intent)
        }
    }
}