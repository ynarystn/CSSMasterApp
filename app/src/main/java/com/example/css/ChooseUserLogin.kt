package com.example.css

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class ChooseUserLogin : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_choose_user_login)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val teacherButton = findViewById<ImageButton>(R.id.teacher_button)
        teacherButton.setOnClickListener {
            val intent = Intent(this, LoginPage::class.java)
            intent.putExtra("userType", "teacher") // Pass "teacher"
            startActivity(intent)
        }

        val studentButton = findViewById<ImageButton>(R.id.student_button)
        studentButton.setOnClickListener {
            val intent = Intent(this, LoginPage::class.java)
            intent.putExtra("userType", "student") // Pass "student"
            startActivity(intent)
        }

        val createAccountText = findViewById<TextView>(R.id.create_account_text)
        createAccountText.setOnClickListener {
            val intent = Intent(this, CreateAccount::class.java)
            startActivity(intent)
        }

    }
}