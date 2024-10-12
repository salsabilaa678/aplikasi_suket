package com.example.pemrograman_bergerak

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Liatproses2Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_liatproses2)
        val ImageButtonA = findViewById<ImageButton>(R.id.ImageButton1)

        ImageButtonA.setOnClickListener {
            val intent = Intent(this@Liatproses2Activity, Suratproses2Activity::class.java)
            startActivity(intent)
        }

        val ImageButtonB = findViewById<ImageButton>(R.id.back)

        ImageButtonB.setOnClickListener {
            val intent = Intent(this@Liatproses2Activity, Home2Activity::class.java)
            startActivity(intent)
        }

    }
}