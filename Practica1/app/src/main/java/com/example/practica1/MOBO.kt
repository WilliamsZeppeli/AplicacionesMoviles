package com.example.practica1

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MOBO : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mobo)

        val btnInspectCPU = findViewById<Button>(R.id.btnInspectCPU)

        btnInspectCPU.setOnClickListener {

            val intent = Intent(this, CPU::class.java)
            startActivity(intent)
        }
    }
}