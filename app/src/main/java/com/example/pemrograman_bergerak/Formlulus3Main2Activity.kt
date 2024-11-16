package com.example.pemrograman_bergerak

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Formlulus3Main2Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.formlulus3_main2)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val Button1 = findViewById<Button>(R.id.buttonN)

        Button1.setOnClickListener {
            val intent = Intent(this@Formlulus3Main2Activity, TranskripdoneMain2Activity::class.java)
            startActivity(intent)
        }
        val ImageButton1 = findViewById<ImageButton>(R.id.back)

        ImageButton1.setOnClickListener {
            val intent = Intent(this@Formlulus3Main2Activity, Formlulus2Main2Activity::class.java)
            startActivity(intent)
        }

    }
}
