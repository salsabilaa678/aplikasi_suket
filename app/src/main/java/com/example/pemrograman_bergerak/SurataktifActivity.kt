package com.example.pemrograman_bergerak

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class SurataktifActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_surataktif)

        val DaftarButton1 = findViewById<Button>(R.id.buttonW1)

        DaftarButton1.setOnClickListener {
            val intent = Intent(this@SurataktifActivity, FormuliraktifActivity::class.java)
            startActivity(intent)
        }
    }
}