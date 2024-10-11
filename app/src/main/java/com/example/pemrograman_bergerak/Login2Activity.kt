package com.example.pemrograman_bergerak

import android.content.Intent      // Tambahkan import untuk Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.widget.Button        // Tambahkan import untuk Button

class Login2Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_login2)

        // Referensi tombol dengan ID 'btnLogin'
        val btnLogin: Button = findViewById(R.id.btnLogin)

        // Listener untuk menangani event ketika tombol 'LOGIN' diklik
        btnLogin.setOnClickListener {
            // Intent untuk berpindah dari Login2Activity ke Home2Activity
            val intent = Intent(this, Home2Activity::class.java)
            startActivity(intent)  // Mulai activity Home2Activity
        }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}
