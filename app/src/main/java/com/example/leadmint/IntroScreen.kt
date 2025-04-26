package com.example.leadmint

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.viewpager2.widget.ViewPager2

class IntroScreen : AppCompatActivity() {
    private lateinit var viewPager: ViewPager2
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intro_screen)

        viewPager = findViewById(R.id.viewPager2)

        val layouts = listOf(R.layout.intro1, R.layout.intro2, R.layout.intro3)
        val adapter = adapter(layouts)
        viewPager.adapter = adapter

        val btnNext = findViewById<ImageView>(R.id.btn_next)
        btnNext.setOnClickListener {
            val currentItem = viewPager.currentItem
            if (currentItem < layouts.size - 1) {
                viewPager.setCurrentItem(currentItem + 1, true)
            } else {
                startActivity(Intent(this@IntroScreen, MainActivity::class.java))
            }
        }
    }
}