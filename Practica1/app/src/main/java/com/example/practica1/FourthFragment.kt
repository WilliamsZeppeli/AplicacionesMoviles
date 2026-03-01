package com.example.practica1

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button

class FourthFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_fourth, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val btnCambio = view.findViewById<Button>(R.id.btnRegresar)
        btnCambio.setOnClickListener {
            val intent = Intent(requireActivity(), MainActivity::class.java) //nombre de clase provisional, cambiar cuando todo este junto
            startActivity(intent)
            requireActivity().finish()
        }
    }

}