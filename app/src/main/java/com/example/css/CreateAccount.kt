package com.example.css

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class CreateAccount : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_create_account)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val submitButton = findViewById<ImageButton>(R.id.submit_button)
        submitButton.setOnClickListener {
            val intent = Intent(this, AuthenticationCode::class.java)
            startActivity(intent)
        }

        val loginButton = findViewById<ImageButton>(R.id.login_button)
        loginButton.setOnClickListener {
            val intent = Intent(this, ChooseUserLogin::class.java)
            startActivity(intent)
        }
    }
}