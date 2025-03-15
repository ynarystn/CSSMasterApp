package com.example.css

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.bottomnavigation.BottomNavigationView

class StudentDashboard : BottomNav() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_student_dashboard)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        setupBottomNavigation()

        // Set OnClickListener to navigate to ModuleHardware
        val hardwareButton = findViewById<ImageButton>(R.id.hardware_card_1)
        hardwareButton.setOnClickListener {
            val intent = Intent(this, ModuleHardware::class.java)
            startActivity(intent)
        }

        // Set OnClickListener to navigate to SoftwareHardware
        val softwareButton = findViewById<ImageButton>(R.id.software_card)
        softwareButton.setOnClickListener {
            val intent = Intent(this, ModuleSoftware::class.java)
            startActivity(intent)
        }
    }
}