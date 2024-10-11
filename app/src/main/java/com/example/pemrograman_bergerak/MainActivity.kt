package com.example.pemrograman_bergerak

import android.content.Intent      // Tambahkan import untuk Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.widget.Button        // Tambahkan import untuk Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)   // Set layout ke activity_main.xml

        // Referensi tombol dengan ID 'btndaftar'
        val btnDaftar: Button = findViewById(R.id.btndaftar)

        // Listener untuk menangani event ketika tombol 'LOGIN' diklik
        btnDaftar.setOnClickListener {
            // Intent untuk berpindah dari MainActivity ke Login2Activity
            val intent = Intent(this, Login2Activity::class.java)
            startActivity(intent)  // Mulai activity Login2Activity
        }
    }
}
