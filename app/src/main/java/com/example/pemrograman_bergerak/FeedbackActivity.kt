package com.example.pemrograman_bergerak

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageButton
import android.widget.RatingBar
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class FeedbackActivity : AppCompatActivity() {

    // Deklarasi variabel untuk elemen UI
    private lateinit var ratingBar: RatingBar
    private lateinit var edtFeedback: EditText
    private lateinit var btnSubmit: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_feedback) // Menyambungkan dengan layout activity_feedback.xml

        // Inisialisasi elemen-elemen berdasarkan ID dari layout
        ratingBar = findViewById(R.id.ratingBar)
        edtFeedback = findViewById(R.id.edtFeedback)
        btnSubmit = findViewById(R.id.btnSubmit)

        // Set OnClickListener untuk tombol Kirim
        btnSubmit.setOnClickListener {
            val rating = ratingBar.rating
            val feedbackText = edtFeedback.text.toString()

            if (feedbackText.isEmpty()) {
                // Jika teks feedback kosong, tampilkan toast
                Toast.makeText(this, "Mohon isi pendapat Anda", Toast.LENGTH_SHORT).show()
            } else {
                // Logika pengiriman rating dan feedback (misal menyimpan ke database atau server)
                Toast.makeText(this, "Terima kasih atas feedback Anda!", Toast.LENGTH_SHORT).show()

                // Reset setelah feedback dikirim
                ratingBar.rating = 0f
                edtFeedback.setText("")
            }

        }
        val imagebutton1 = findViewById<ImageButton>(R.id.back)

        imagebutton1.setOnClickListener {
            val intent = Intent(this@FeedbackActivity, Home2Activity::class.java)
            startActivity(intent)
        }

    }
}
