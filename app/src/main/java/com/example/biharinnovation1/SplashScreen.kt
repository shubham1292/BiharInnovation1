package com.example.biharinnovation1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.animation.AnimationUtils
import android.widget.ImageView
import android.widget.TextView

class SplashScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)
        val logo: ImageView = findViewById(R.id.topLogo)
        val slideAnimation = AnimationUtils.loadAnimation(this,R.anim.top_animation)
        logo.startAnimation(slideAnimation)

        val bottomText: TextView = findViewById(R.id.bottomText)
        val bottomAnimation = AnimationUtils.loadAnimation(this,R.anim.bottom_animation)
        bottomText.startAnimation(bottomAnimation)

        supportActionBar?.hide()

        Handler().postDelayed({
            startActivity(Intent(this,MainActivity::class.java))
            finish()
        },2000)
    }
}