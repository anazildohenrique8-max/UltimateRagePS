package com.ultimaterage

import android.app.Activity
import android.os.Bundle
import android.graphics.Color
import android.view.Gravity
import android.widget.*

class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        window.statusBarColor = Color.rgb(12, 12, 18)
        window.navigationBarColor = Color.rgb(12, 12, 18)

        val layout = LinearLayout(this).apply {
            orientation = LinearLayout.VERTICAL
            setPadding(24, 30, 24, 20)
            setBackgroundColor(Color.rgb(12, 12, 18))
        }

        val title = TextView(this).apply {
            text = "ULTIMATE RAGE"
            textSize = 30f
            setTextColor(Color.WHITE)
            gravity = Gravity.CENTER
        }

        layout.addView(title)

        val subtitle = TextView(this).apply {
            text = "GAMING EXPERIENCE"
            textSize = 12f
            setTextColor(Color.LTGRAY)
            gravity = Gravity.CENTER
        }

        layout.addView(subtitle)

        val menu = listOf(
            "Início",
            "Configurações",
            "Mods",
            "Texturas",
            "Drivers"
        )

        menu.forEach { item ->
            val button = Button(this).apply {
                text = item
                textSize = 16f
                setOnClickListener {
                    Toast.makeText(
                        this@MainActivity,
                        "$item em desenvolvimento",
                        Toast.LENGTH_SHORT
                    ).show()
                }
            }
            layout.addView(button)
        }

        setContentView(layout)
    }
}
