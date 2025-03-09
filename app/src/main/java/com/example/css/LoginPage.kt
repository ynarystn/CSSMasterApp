package com.example.css

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class LoginPage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_login_page)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // Find the teacher_button by ID
        val backButton = findViewById<ImageButton>(R.id.back_button)
        val logo = findViewById<ImageView>(R.id.logo)
        val loginButton = findViewById<ImageButton>(R.id.login_button)

        // Get userType from Intent
        val userType = intent.getStringExtra("userType")

        // Set logo based on userType
        if (userType == "teacher") {
            logo.setImageResource(R.drawable.teacher_logo) // Set teacher logo
        } else if (userType == "student") {
            logo.setImageResource(R.drawable.student_logo) // Set student logo
        }

        // Set OnClickListener to navigate to LoginPage
        backButton.setOnClickListener {
            val intent = Intent(this, ChooseUserLogin::class.java)
            startActivity(intent)
        }

        loginButton.setOnClickListener {
            val intent = when (userType) {
                "teacher" -> Intent(this, TeacherDashboard::class.java)
                "student" -> Intent(this, StudentDashboard::class.java)
                else -> null
            }

            intent?.let {
                startActivity(it)
            }
        }
    }
}