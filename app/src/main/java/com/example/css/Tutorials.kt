package com.example.css

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Tutorials : BottomNav() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_tutorials)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        setupBottomNavigation()

        // Set OnClickListener to navigate to TutorialsHardware
        val hardwareCard = findViewById<ImageButton>(R.id.hardware_card)
        hardwareCard.setOnClickListener {
            val intent = Intent(this, TutorialsHardware::class.java)
            startActivity(intent)
        }

        // Set OnClickListener to navigate to TutorialsHardware
        val softwareCard = findViewById<ImageButton>(R.id.software_card)
        softwareCard.setOnClickListener {
            val intent = Intent(this, TutorialsHardware::class.java)
            startActivity(intent)
        }

    }
}