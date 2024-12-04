package com.mirae.weatherlatamagroovyfinal

import android.os.Bundle
import android.widget.LinearLayout
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.graphics.Color;
import androidx.core.content.ContextCompat
import com.mirae.weatherlatamagroovyfinal.R.id.main_layout


class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)


        // Obtener el layout principal
        val mainLayout = findViewById<LinearLayout>(R.id.main_layout)
        val backgroundColor = ContextCompat.getColor(this, R.color.background_color)
        mainLayout.setBackgroundColor(backgroundColor)




    }
}