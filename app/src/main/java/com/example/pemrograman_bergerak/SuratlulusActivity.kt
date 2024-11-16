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

class SuratlulusActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_suratlulus)

        val ImageButtonD = findViewById<ImageButton>(R.id.imageback)

        ImageButtonD.setOnClickListener {
            val intent = Intent(this@SuratlulusActivity, Home2Activity::class.java)
            startActivity(intent)
        }

        val Button1 = findViewById<Button>(R.id.button)

        Button1.setOnClickListener {
            val intent = Intent(this@SuratlulusActivity, Formlulus1Main2Activity::class.java)
            startActivity(intent)
        }

    }
}
