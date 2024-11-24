package com.example.pemrograman_bergerak

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageButton
import android.widget.RatingBar
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.database.FirebaseDatabase


class FeedbackActivity : AppCompatActivity() {

    // Deklarasi variabel untuk elemen UI
    private lateinit var ratingBar: RatingBar
    private lateinit var edtFeedback: EditText
    private lateinit var btnSubmit: Button

    @SuppressLint("CutPasteId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_feedback) // Menyambungkan dengan layout activity_feedback.xml

        // Inisialisasi elemen-elemen berdasarkan ID dari layout
        ratingBar = findViewById(R.id.ratingBar)
        edtFeedback = findViewById(R.id.edtFeedback)
        btnSubmit = findViewById(R.id.btnSubmit)

        btnSubmit.setOnClickListener {
            val rating = ratingBar.rating
            val feedbackText = edtFeedback.text.toString()

            if (feedbackText.isEmpty()) {
                Toast.makeText(this, "Mohon isi pendapat Anda", Toast.LENGTH_SHORT).show()
            } else {
                // Referensi ke Firebase Database
                val database = FirebaseDatabase.getInstance()
                val feedbackRef = database.getReference("feedback")

                // ID unik untuk setiap feedback
                val feedbackId = feedbackRef.push().key

                // Objek data feedback
                val feedbackData = mapOf(
                    "rating" to rating,
                    "feedbackText" to feedbackText
                )

                // Simpan data ke Firebase
                feedbackId?.let {
                    feedbackRef.child(it).setValue(feedbackData)
                        .addOnSuccessListener {
                            Toast.makeText(
                                this,
                                "Terima kasih atas feedback Anda!",
                                Toast.LENGTH_SHORT
                            ).show()

                            // Reset UI
                            ratingBar.rating = 0f
                            edtFeedback.setText("")
                        }
                        .addOnFailureListener { error ->
                            Toast.makeText(
                                this,
                                "Gagal mengirim feedback: ${error.message}",
                                Toast.LENGTH_SHORT
                            ).show()
                        }
                }
            }
        }
    }
}
