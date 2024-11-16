package com.example.pemrograman_bergerak

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.ImageButton
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.WindowCompat

class Transkipnilai3Activity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Aktifkan tata letak edge-to-edge
        WindowCompat.setDecorFitsSystemWindows(window, false)
        setContentView(R.layout.activity_transkipnilai3)

        // Ambil data dari Intent
        val keperluan = intent.getStringExtra("keperluan")

        // Pastikan elemen dengan id "layoutCheckboxContainer" ada di XML
        val layoutContainer = findViewById<LinearLayout>(R.id.layoutCheckboxContainer)

        // Buat CheckBox secara dinamis untuk keperluan yang dipilih
        if (keperluan != null) {
            val checkBox = CheckBox(this).apply {
                text = keperluan
                isChecked = true
                textSize = 16f
                setPadding(16, 16, 16, 16)
            }
            // Tambahkan CheckBox ke dalam LinearLayout
            layoutContainer.addView(checkBox)
        } else {
            // Jika tidak ada keperluan yang dipilih, tambahkan pesan default
            val checkBox = CheckBox(this).apply {
                text = "Tidak ada keperluan yang dipilih"
                isChecked = false
                textSize = 16f
                setPadding(16, 16, 16, 16)
            }
            layoutContainer.addView(checkBox)
        }

        // Image Button
        val ImageButton1 = findViewById<ImageButton>(R.id.back)

        ImageButton1.setOnClickListener {
            val intent = Intent(this@Transkipnilai3Activity, Transkipnilai2Activity::class.java)
            startActivity(intent)
        }

        val daftarButton = findViewById<Button>(R.id.buttonN)

        daftarButton.setOnClickListener {
            val intent = Intent(this@Transkipnilai3Activity, TranskripdoneMain2Activity::class.java)
            startActivity(intent)
        }

    }
}
