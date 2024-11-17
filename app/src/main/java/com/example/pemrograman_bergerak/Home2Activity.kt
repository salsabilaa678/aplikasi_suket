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
import android.widget.TextView


class Home2Activity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_home2)

        // Ambil data email dari Intent
        val userEmail = intent.getStringExtra("user_email")

        // Referensi ke TextView yang akan diubah
        val tvUserName = findViewById<TextView>(R.id.textView3)
        // Ubah teks TextView sesuai dengan email pengguna
        tvUserName.text = userEmail ?: "Aruni" // Gunakan "Aruni" sebagai teks default jika email tidak tersedia

        // Cari tombol daftar dengan ID
        val daftarButton = findViewById<Button>(R.id.button2)

        daftarButton.setOnClickListener {
            val intent = Intent(this@Home2Activity, Liatproses2Activity::class.java)
            startActivity(intent)
        }

        val daftarButton1 = findViewById<Button>(R.id.buttonA1)

        daftarButton1.setOnClickListener {
            val intent = Intent(this@Home2Activity, SuratSelesaiActivity::class.java)
            startActivity(intent)
        }

        val daftarButton2 = findViewById<Button>(R.id.button4)

        daftarButton2.setOnClickListener {
            val intent = Intent(this@Home2Activity, SuratDitolakActivity::class.java)
            startActivity(intent)
        }



        // Image Button
        val ImageButton1 = findViewById<ImageButton>(R.id.imageButton5)

        ImageButton1.setOnClickListener {
            val intent = Intent(this@Home2Activity, SuratlulusActivity::class.java)
            startActivity(intent)
        }

        val ImageButton2 = findViewById<ImageButton>(R.id.imageButton4)

        ImageButton2.setOnClickListener {
            val intent = Intent(this@Home2Activity, SurataktifActivity::class.java)
            startActivity(intent)
        }

        val ImageButton3 = findViewById<ImageButton>(R.id.image_012)

        ImageButton3.setOnClickListener {
            val intent = Intent(this@Home2Activity, NotifikasiActivity::class.java)
            startActivity(intent)
        }

        val ImageButton4 = findViewById<ImageButton>(R.id.imageButton6)

        ImageButton4.setOnClickListener {
            val intent = Intent(this@Home2Activity, TranskripNilaiActivity::class.java)
            startActivity(intent)
        }

        val ImageButton5 = findViewById<ImageButton>(R.id.imageFb3)

        ImageButton5.setOnClickListener {
            val intent = Intent(this@Home2Activity, FeedbackActivity::class.java)
            startActivity(intent)
        }


    }
}
