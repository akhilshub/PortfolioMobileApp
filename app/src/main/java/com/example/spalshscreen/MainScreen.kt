package com.example.spalshscreen

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main_screen)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val git=findViewById<TextView>(R.id.git)
        git.setOnClickListener{
            val email = "akhilme341@gmail.com"
            val selectorIntent = Intent(Intent.ACTION_SENDTO)
            val urlString = "mailto:" + Uri.encode(email)
            selectorIntent.data = Uri.parse(urlString)
            startActivity(selectorIntent)
        }
        val webs=findViewById<TextView>(R.id.website)
        webs.setOnClickListener{
            val web="https://akhilshub.github.io/prof2/"
            val selectorIntent = Intent(Intent.ACTION_VIEW)
            selectorIntent.data = Uri.parse(web)
            startActivity(selectorIntent)
        }
    }
}