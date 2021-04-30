package com.example.poemapplication

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class thirdPage : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third_page)

        val previousButton = findViewById<Button>(R.id.previousButton)
        val nextButton = findViewById<Button>(R.id.nextButton)

        previousButton.setOnClickListener {
            val previousPageSkip = Intent(this, secondPage::class.java)
            startActivity(previousPageSkip)
        }

        nextButton.setOnClickListener {
            val nextPageSkip = Intent(this, fourthPage::class.java)
            startActivity(nextPageSkip)
        }

    }
}