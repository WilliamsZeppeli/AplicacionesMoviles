package com.example.practica1

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

class FragmentGabinete : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Esto infla el diseño que ya hicimos con tu imagen neón
        return inflater.inflate(R.layout.fragment_gabinete, container, false)
    }
}