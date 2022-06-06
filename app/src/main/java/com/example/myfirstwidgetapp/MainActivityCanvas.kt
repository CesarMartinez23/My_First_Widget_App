package com.example.myfirstwidgetapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivityCanvas : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_canvas)

        val wvCanvasUgb = findViewById<android.webkit.WebView>(R.id.wvCanvasUgb)

        wvCanvasUgb.loadUrl("https://ugb.instructure.com/login/canvas")
    }
}