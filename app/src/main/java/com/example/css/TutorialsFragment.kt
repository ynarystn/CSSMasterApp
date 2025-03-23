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

        // Set OnClickListener to navigate to TutorialsHardware
        view.findViewById<ImageButton>(R.id.hardware_card).setOnClickListener {
            val intent = Intent(requireContext(), TutorialsHardware::class.java)
            startActivity(intent)
        }

        // Set OnClickListener to navigate to TutorialsSoftware
        view.findViewById<ImageButton>(R.id.software_card).setOnClickListener {
            val intent = Intent(requireContext(), TutorialsHardware::class.java)
            startActivity(intent)
        }
    }
}
