package com.example.practica1

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button

class ThirdFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_third, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val btnBack = view.findViewById<Button>(R.id.btnBack)
        btnBack.setOnClickListener {
            val intent = Intent(requireActivity(), SecondActivity::class.java)
            startActivity(intent)
            requireActivity().finish()
        }
        val btnNext = view.findViewById<Button>(R.id.btnNext)
        btnNext.setOnClickListener {
            val intent = Intent(requireActivity(), FourthActivity::class.java)
            startActivity(intent)
            requireActivity().finish()
        }
    }

}