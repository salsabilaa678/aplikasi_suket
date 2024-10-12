package com.example.pemrograman_bergerak

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.appcompat.app.AppCompatActivity

class SplashActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash) // Gunakan layout yang benar

        // Menggunakan Handler untuk delay selama 3 detik sebelum berpindah ke MainActivity
        Handler(Looper.getMainLooper()).postDelayed({
            // Intent untuk berpindah ke MainActivity
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish() // Mengakhiri SplashActivity agar tidak kembali
        }, 3000) // 3000 ms = 3 detik
    }
}
