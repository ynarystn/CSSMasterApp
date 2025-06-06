package com.example.css

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import androidx.fragment.app.Fragment

class TutorialsFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_tutorials, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // Hardware card click
        view.findViewById<ImageButton>(R.id.hardware_card).setOnClickListener {
            val intent = Intent(requireContext(), TutorialsHardware::class.java)
            intent.putExtra("course_type", "hardware") // sending data
            startActivity(intent)
        }

        // Software card click
        view.findViewById<ImageButton>(R.id.software_card).setOnClickListener {
            val intent = Intent(requireContext(), TutorialsHardware::class.java)
            intent.putExtra("course_type", "software") // sending data
            startActivity(intent)
        }
    }
}
