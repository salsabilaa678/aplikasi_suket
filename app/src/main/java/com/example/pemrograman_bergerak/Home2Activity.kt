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

class Home2Activity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_home2)
        // Cari tombol daftar dengan ID
        val daftarButton = findViewById<Button>(R.id.button2)

        daftarButton.setOnClickListener {
            val intent = Intent(this@Home2Activity, Liatproses2Activity::class.java)
            startActivity(intent)
        }

        val ImageButton1 = findViewById<ImageButton>(R.id.imageButton4)

        ImageButton1.setOnClickListener {
            val intent = Intent(this@Home2Activity, SuratlulusActivity::class.java)
            startActivity(intent)
        }
    }
}
