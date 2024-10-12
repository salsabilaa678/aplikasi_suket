package com.example.pemrograman_bergerak

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Suratproses2Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_suratproses2)

        val ImageButtonC = findViewById<ImageButton>(R.id.image67)

        ImageButtonC.setOnClickListener {
            val intent = Intent(this@Suratproses2Activity, Liatproses2Activity::class.java)
            startActivity(intent)
        }
    }
}