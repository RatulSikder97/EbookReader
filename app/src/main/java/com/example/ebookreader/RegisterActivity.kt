package com.example.ebookreader

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageButton
import android.widget.TextView

class RegisterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        val signInLink = findViewById<TextView>(R.id.signInLink)
        signInLink.setOnClickListener {
            var intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
            finish()
        }

        val backBtn = findViewById<ImageButton>(R.id.backToHome)
        backBtn.setOnClickListener {
            finish()
        }

    }
}