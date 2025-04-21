package com.example.css

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.LinearLayout
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.viewpager2.widget.ViewPager2

class OnboardingPage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_onboarding_page)

        val viewPager = findViewById<androidx.viewpager2.widget.ViewPager2>(R.id.viewPager)
        viewPager.adapter = OnboardingPagerAdapter()

        // Optional: Add page change listener to update dots
        viewPager.registerOnPageChangeCallback(object : ViewPager2.OnPageChangeCallback() {
            override fun onPageSelected(position: Int) {
                super.onPageSelected(position)
                val circleTabs = findViewById<LinearLayout>(R.id.circleTabs)
                val selectedDot = circleTabs.getChildAt(0)
                val unselectedDot = circleTabs.getChildAt(1)


                selectedDot.setBackgroundResource(
                    if (position == 0) R.drawable.get_started_selected_dot else R.drawable.get_started_unselected_dot
                )
                unselectedDot.setBackgroundResource(
                    if (position == 1) R.drawable.get_started_selected_dot else R.drawable.get_started_unselected_dot
                )
            }
        })

        val getStartedButton = findViewById<ImageButton>(R.id.getStartedButton)
        getStartedButton.setOnClickListener {
            val intent = Intent(this, ChooseUserLogin::class.java)
            startActivity(intent)
        }
    }
}