package com.example.recyclersimpson_07_11_22

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //Declaramos un intent que va al MainActivity
        val i = Intent(this, MainActivity::class.java)
        //Y lanzamos la activity
        startActivity(i)
    }
}