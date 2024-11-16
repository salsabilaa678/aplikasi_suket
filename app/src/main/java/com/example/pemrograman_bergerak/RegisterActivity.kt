package com.example.pemrograman_bergerak

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.FirebaseApp
import com.google.firebase.auth.FirebaseAuth

class RegisterActivity : AppCompatActivity() {

    // Instance FirebaseAuth
    private lateinit var auth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Inisialisasi Firebase
        FirebaseApp.initializeApp(this)
        auth = FirebaseAuth.getInstance()

        // Menghubungkan layout dengan activity
        setContentView(R.layout.activity_register)

        // Referensi elemen layout
        val etUsername: EditText = findViewById(R.id.etUsername)
        val etEmail: EditText = findViewById(R.id.etEmail)
        val etPassword: EditText = findViewById(R.id.etPassword)
        val btnRegister: Button = findViewById(R.id.btnRegister)
        val tvAlreadyHaveAccount: TextView = findViewById(R.id.tvAlreadyHaveAccount)

        // Listener untuk tombol Register
        btnRegister.setOnClickListener {
            val username = etUsername.text.toString().trim()
            val email = etEmail.text.toString().trim()
            val password = etPassword.text.toString().trim()

            if (username.isEmpty() || email.isEmpty() || password.isEmpty()) {
                Toast.makeText(this, "Semua kolom harus diisi!", Toast.LENGTH_SHORT).show()
            } else if (password.length < 6) {
                Toast.makeText(this, "Password harus memiliki minimal 6 karakter!", Toast.LENGTH_SHORT).show()
            } else {
                registerUser(email, password)
            }
        }

        // Listener untuk TextView "Sudah punya akun"
        tvAlreadyHaveAccount.setOnClickListener {
            // Navigasi ke halaman login
            val intent = Intent(this, Login2Activity::class.java)
            startActivity(intent)
            finish()
        }
    }

    // Fungsi untuk mendaftarkan pengguna baru menggunakan Firebase Authentication
    private fun registerUser(email: String, password: String) {
        auth.createUserWithEmailAndPassword(email, password)
            .addOnCompleteListener(this) { task ->
                if (task.isSuccessful) {
                    // Registrasi berhasil
                    Toast.makeText(this, "Pendaftaran berhasil!", Toast.LENGTH_SHORT).show()
                    // Pindah ke halaman login atau halaman utama
                    val intent = Intent(this, Login2Activity::class.java)
                    startActivity(intent)
                    finish()
                } else {
                    // Registrasi gagal
                    Toast.makeText(this, "Pendaftaran gagal: ${task.exception?.message}", Toast.LENGTH_SHORT).show()
                    Log.e("RegisterError", task.exception?.message ?: "Error tidak diketahui")
                }
            }
    }
}
