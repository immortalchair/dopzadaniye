package com.example.dopzadaniye

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class Plant : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_plant)
        val imageView = findViewById<ImageView>(R.id.imageView)

        imageView.setOnClickListener{
            startActivity(Intent(this,MainActivity::class.java))
        }
    }
}