package com.example.poemapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class fourthPage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fourth_page)

        val button1 = findViewById<Button>(R.id.previousButton)
        val button2 = findViewById<Button>(R.id.nextButton)

        button1.setOnClickListener {
            val boba = Intent(this, thirdPage::class.java)
            startActivity(boba)
        }

        button2.setOnClickListener{
            val biba = Intent(this, firstPage::class.java)
            startActivity(biba)
        }
    }
}