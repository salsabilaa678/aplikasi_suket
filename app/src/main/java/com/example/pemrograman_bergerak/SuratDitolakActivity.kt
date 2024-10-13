package com.example.pemrograman_bergerak

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class SuratDitolakActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_suratditolak)

        val ButtonA = findViewById<Button>(R.id.Button_T1k)

        ButtonA.setOnClickListener {
            val intent = Intent(this@SuratDitolakActivity, RincianditolakActivity::class.java)
            startActivity(intent)
        }
    }
}