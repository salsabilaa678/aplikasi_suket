package com.example.pemrograman_bergerak

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity

class Formuliraktif2Activity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_formuliraktif2)

        val daftarButton1 = findViewById<Button>(R.id.button5o)
        val imageButton1 = findViewById<ImageButton>(R.id.back)
        val jelajahiButton1 = findViewById<Button>(R.id.button6)
        val jelajahiButton2 = findViewById<Button>(R.id.button9)
        val jelajahiButton3 = findViewById<Button>(R.id.button10)

        // Intent for button5o to move to Formuliraktif3Activity
        daftarButton1.setOnClickListener {
            val intent = Intent(this@Formuliraktif2Activity, Formuliraktif3Activity::class.java)
            startActivity(intent)
        }

        // Intent for back button to move back to FormuliraktifActivity
        imageButton1.setOnClickListener {
            val intent = Intent(this@Formuliraktif2Activity, FormuliraktifActivity::class.java)
            startActivity(intent)
        }

        // Intent for "Jelajahi" buttons to open gallery
        jelajahiButton1.setOnClickListener {
            openGallery()
        }

        jelajahiButton2.setOnClickListener {
            openGallery()
        }

        jelajahiButton3.setOnClickListener {
            openGallery()
        }
    }

    private fun openGallery() {
        // Code to open gallery for selecting images
        val intent = Intent(Intent.ACTION_PICK)
        intent.type = "image/*" // Restricting selection to images
        startActivityForResult(intent, 100) // Request code 100 for identifying result later
    }
}
