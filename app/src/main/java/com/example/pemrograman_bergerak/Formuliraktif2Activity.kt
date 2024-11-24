package com.example.pemrograman_bergerak

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.pemrograman_bergerak.FormuliraktifActivity
import com.example.pemrograman_bergerak.R
import com.example.pemrograman_bergerak.TranskripdoneMain2Activity
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.storage.FirebaseStorage
import com.google.firebase.storage.StorageReference

class Formuliraktif2Activity : AppCompatActivity() {
    private lateinit var storageReference: StorageReference

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_formuliraktif2)

        // Inisialisasi Firebase Storage
        storageReference = FirebaseStorage.getInstance().reference

        val daftarButton1 = findViewById<Button>(R.id.button5o)
        val imageButton1 = findViewById<ImageButton>(R.id.back)
        val jelajahiButton1 = findViewById<Button>(R.id.button6)
        val jelajahiButton2 = findViewById<Button>(R.id.button9)
        val jelajahiButton3 = findViewById<Button>(R.id.button10)

        // Intent untuk pindah antar aktivitas
        daftarButton1.setOnClickListener {
            val intent = Intent(this, TranskripdoneMain2Activity::class.java)
            startActivity(intent)
        }

        imageButton1.setOnClickListener {
            val intent = Intent(this, FormuliraktifActivity::class.java)
            startActivity(intent)
        }

        // Pilih gambar dari galeri
        jelajahiButton1.setOnClickListener { openGallery() }
        jelajahiButton2.setOnClickListener { openGallery() }
        jelajahiButton3.setOnClickListener { openGallery() }
    }

    private fun openGallery() {
        val intent = Intent(Intent.ACTION_PICK)
        intent.type = "image/*"
        startActivityForResult(intent, 100)
    }

    @Deprecated("Deprecated in Java")
    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode == 100 && resultCode == RESULT_OK) {
            val imageUri: Uri? = data?.data
            imageUri?.let {
                uploadToFirebase(it)
            }
        }
    }

    private fun uploadToFirebase(imageUri: Uri) {
        val fileReference = storageReference.child("images/${System.currentTimeMillis()}.jpg")

        fileReference.putFile(imageUri)
            .addOnSuccessListener {
                fileReference.downloadUrl.addOnSuccessListener { uri ->
                    Toast.makeText(this, "Gambar berhasil diunggah: $uri", Toast.LENGTH_SHORT).show()
                }
            }
            .addOnFailureListener { e ->
                Toast.makeText(this, "Gagal mengunggah: ${e.message}", Toast.LENGTH_SHORT).show()
            }
    }
}
