package com.example.practica1

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        // 1. Ajuste para que el diseño respete las barras del sistema (status bar)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // 2. NIVEL 1: Cargar el Fragment del Gabinete/PC al iniciar la app
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.contenedor_fragment, FragmentGabinete())
                .commit()
        }

        // 3. NAVEGACIÓN: Configurar el botón para entrar a la Tarjeta Madre (SecondActivity)
        val btnIrAMobo = findViewById<Button>(R.id.btnIrAMobo)
        btnIrAMobo.setOnClickListener {
            // Esto crea el salto hacia el siguiente nivel de la jerarquía
            val intent = Intent(this, SecondActivity::class.java)
            startActivity(intent)
        }
    }
}