package com.example.pemrograman_bergerak

import android.content.Intent      // Import untuk Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.widget.Button        // Import untuk Button
import com.example.pemrograman_bergerak.R.id.btnRegister

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)   // Set layout ke activity_main.xml

        // Referensi tombol 'LOGIN' dengan ID 'btndaftar'
        val btnLogin: Button = findViewById(R.id.btnLogin)
        btnLogin.setOnClickListener {
            // Intent untuk berpindah dari MainActivity ke Login2Activity
            val intent = Intent(this, Login2Activity::class.java)
            startActivity(intent)  // Mulai activity Login2Activity
        }

        // Referensi tombol 'DAFTAR' dengan ID 'btndaftar_register'
        val btnDaftar: Button = findViewById(btnRegister)
        btnDaftar.setOnClickListener {
            // Intent untuk berpindah dari MainActivity ke RegisterActivity
            val intent = Intent(this, RegisterActivity::class.java)
            startActivity(intent)  // Mulai activity RegisterActivity
        }
    }
}
