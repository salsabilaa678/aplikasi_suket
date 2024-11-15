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

class FormuliraktifActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_formuliraktif)

        val button1 = findViewById<Button>(R.id.button5i)

        button1.setOnClickListener {
            val intent = Intent(this@FormuliraktifActivity, Formuliraktif2Activity::class.java)
            startActivity(intent)
        }

        val imagebutton1 = findViewById<ImageButton>(R.id.back)

        imagebutton1.setOnClickListener {
            val intent = Intent(this@FormuliraktifActivity, SurataktifActivity::class.java)
            startActivity(intent)
        }

    }
}