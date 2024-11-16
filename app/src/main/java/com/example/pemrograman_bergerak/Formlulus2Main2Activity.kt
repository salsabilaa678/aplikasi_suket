package com.example.pemrograman_bergerak

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Formlulus2Main2Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.formlulus2_main2)

        // Handling system bar insets
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // Button to navigate to Formlulus3Main2Activity
        val button1 = findViewById<Button>(R.id.button5o)
        button1.setOnClickListener {
            val intent = Intent(this@Formlulus2Main2Activity, Formlulus3Main2Activity::class.java)
            startActivity(intent)
        }

        // Back button to navigate to Formlulus1Main2Activity
        val imageButton1 = findViewById<ImageButton>(R.id.back)
        imageButton1.setOnClickListener {
            val intent = Intent(this@Formlulus2Main2Activity, Formlulus1Main2Activity::class.java)
            startActivity(intent)
        }

        // Buttons to open the gallery
        val jelajahiButton1 = findViewById<Button>(R.id.button6)
        jelajahiButton1.setOnClickListener {
            openGallery()
        }

        val jelajahiButton2 = findViewById<Button>(R.id.button9)
        jelajahiButton2.setOnClickListener {
            openGallery()
        }

        val jelajahiButton3 = findViewById<Button>(R.id.button10)
        jelajahiButton3.setOnClickListener {
            openGallery()
        }
    }

    // Function to open the gallery
    private fun openGallery() {
        val intent = Intent(Intent.ACTION_PICK)
        intent.type = "image/*" // Restricting selection to images
        startActivityForResult(intent, 100)
    }
}
