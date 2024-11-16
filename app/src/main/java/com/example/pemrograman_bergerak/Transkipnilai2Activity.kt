package com.example.pemrograman_bergerak

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.CheckBox
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.WindowCompat

class Transkipnilai2Activity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        WindowCompat.setDecorFitsSystemWindows(window, false) // Mode edge-to-edge
        setContentView(R.layout.activity_transkipnilai2)

        // Inisialisasi checkbox
        val checkBox1 = findViewById<CheckBox>(R.id.checkBox1) // Daftar Sidang
        val checkBox2 = findViewById<CheckBox>(R.id.checkBox2) // Daftar Kerja Praktik
        val checkBox3 = findViewById<CheckBox>(R.id.checkBox3) // Konversi Nilai
        val checkBox4 = findViewById<CheckBox>(R.id.checkBox4) // Daftar Yudisium/Wisuda
        val checkBox5 = findViewById<CheckBox>(R.id.checkBox5) // Daftar Beasiswa
        val checkBox6 = findViewById<CheckBox>(R.id.checkBox6) // Drop Out/Pindah Kampus/Mengundurkan Diri

        // Inisialisasi button
        val button1 = findViewById<Button>(R.id.Button12) // Ganti dengan id yang benar

        button1.setOnClickListener { v: View? ->
            // Intent ke halaman berikutnya
            val intent = Intent(this@Transkipnilai2Activity, Transkipnilai3Activity::class.java)

            // Cek checkbox dan tambahkan data ke intent
            when {
                checkBox1.isChecked -> intent.putExtra("keperluan", "Daftar Sidang")
                checkBox2.isChecked -> intent.putExtra("keperluan", "Daftar Kerja Praktik")
                checkBox3.isChecked -> intent.putExtra("keperluan", "Konversi Nilai")
                checkBox4.isChecked -> intent.putExtra("keperluan", "Daftar Yudisium/Wisuda")
                checkBox5.isChecked -> intent.putExtra("keperluan", "Daftar Beasiswa")
                checkBox6.isChecked -> intent.putExtra("keperluan", "Drop Out/Pindah Kampus/Mengundurkan Diri")
            }

            // Mulai aktivitas
            startActivity(intent)
        }

        val ImageButton1 = findViewById<ImageButton>(R.id.back)

        ImageButton1.setOnClickListener {
            val intent = Intent(this@Transkipnilai2Activity, TranskripNilaiActivity::class.java)
            startActivity(intent)
        }
    }
}
