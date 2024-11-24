package com.example.pemrograman_bergerak


import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageButton
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.database.FirebaseDatabase

class FormuliraktifActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_formuliraktif)

        // Inisialisasi Firebase Realtime Database
        val database = FirebaseDatabase.getInstance()
        val databaseReference = database.getReference("formulir")

        // Ambil referensi EditText dari layout
        val namaInput = findViewById<EditText>(R.id.editTextText2)
        val nimInput = findViewById<EditText>(R.id.editTextText3)
        val nomorHpInput = findViewById<EditText>(R.id.editTextText4)
        val semesterInput = findViewById<EditText>(R.id.editTextText5)

        // Tombol untuk mengirim data dan pindah ke Formuliraktif2Activity
        val button1 = findViewById<Button>(R.id.button5i)

        button1.setOnClickListener {
            // Ambil data dari EditText
            val nama = namaInput.text.toString()
            val nim = nimInput.text.toString()
            val nomorHp = nomorHpInput.text.toString()
            val semester = semesterInput.text.toString()

            // Validasi input pengguna
            if (nama.isEmpty() || nim.isEmpty() || nomorHp.isEmpty() || semester.isEmpty()) {
                Toast.makeText(this, "Harap isi semua data", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            // Buat objek untuk menyimpan data
            val data = mapOf(
                "nama" to nama,
                "nim" to nim,
                "nomor_hp" to nomorHp,
                "semester" to semester
            )

            // Kirim data ke Firebase
            val newRef = databaseReference.push() // Membuat ID unik untuk setiap data
            newRef.setValue(data)
                .addOnCompleteListener {
                    if (it.isSuccessful) {
                        Toast.makeText(this, "Data berhasil dikirim", Toast.LENGTH_SHORT).show()
                        // Pindah ke aktivitas berikutnya
                        val intent = Intent(this@FormuliraktifActivity, Formuliraktif2Activity::class.java)
                        startActivity(intent)
                    } else {
                        Toast.makeText(this, "Gagal mengirim data: ${it.exception?.message}", Toast.LENGTH_SHORT).show()
                    }
                }
        }

        // Tombol untuk kembali ke SurataktifActivity
        val imagebutton1 = findViewById<ImageButton>(R.id.back)

        imagebutton1.setOnClickListener {
            val intent = Intent(this@FormuliraktifActivity, SurataktifActivity::class.java)
            startActivity(intent)
        }
    }
}
