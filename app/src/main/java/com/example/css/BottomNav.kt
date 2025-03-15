package com.example.css

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.bottomnavigation.BottomNavigationView

open class BottomNav : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Set up the navigation bar if the layout includes it
        setupBottomNavigation()
    }

    fun setupBottomNavigation() {
        val bottomNav = findViewById<BottomNavigationView>(R.id.bottom_navigation)

        bottomNav?.setOnItemSelectedListener { item ->
            when (item.itemId) {
                R.id.nav_modules -> {
                    if (this !is StudentDashboard) {
                        startActivity(Intent(this, StudentDashboard::class.java))
                        overridePendingTransition(0, 0)
                        finish()
                    }
                    true
                }
                R.id.nav_games -> {
                    if (this !is Games) {
                        startActivity(Intent(this, Games::class.java))
                        overridePendingTransition(0, 0)
                        finish()
                    }
                    true
                }
                R.id.nav_tutorials -> {
                    if (this !is Games) {
                        startActivity(Intent(this, Games::class.java))
                        overridePendingTransition(0, 0)
                        finish()
                    }
                    true
                }
                R.id.nav_account -> {
                    if (this !is Games) {
                        startActivity(Intent(this, Games::class.java))
                        overridePendingTransition(0, 0)
                        finish()
                    }
                    true
                }
                else -> false
            }
        }
    }
}
