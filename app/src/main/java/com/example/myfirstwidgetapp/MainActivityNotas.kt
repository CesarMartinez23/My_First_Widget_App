package com.example.myfirstwidgetapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivityNotas : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_notas)

        val wvPortalEstudiante = findViewById<android.webkit.WebView>(R.id.wvPortalEstudiante)

        wvPortalEstudiante.loadUrl("https://estudiantes.ugb.edu.sv/Login?ReturnUrl=%2F")
    }
}