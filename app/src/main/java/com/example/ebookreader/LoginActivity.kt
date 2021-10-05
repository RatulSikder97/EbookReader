package com.example.ebookreader

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.TextView
import androidx.appcompat.widget.AppCompatButton

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val signUpLink = findViewById<TextView>(R.id.signupLink)
        signUpLink.setOnClickListener {
            var intent = Intent(this, RegisterActivity::class.java)
            startActivity(intent)
            finish()
        }

        val backBtn = findViewById<ImageButton>(R.id.backToHome)
        backBtn.setOnClickListener {
            onBackPressed()
        }

        val signInBtn = findViewById<AppCompatButton>(R.id.signInBtn)
        signInBtn.setOnClickListener {
            var intent = Intent(this, BookHomeActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}