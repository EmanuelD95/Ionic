package com.emanuel.ionic

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import com.google.android.material.button.MaterialButton

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnSignup: MaterialButton = findViewById<MaterialButton>(R.id.btnSignup)

        btnSignup.setOnClickListener {
            Toast.makeText(this, "Hola Emanuel", Toast.LENGTH_LONG).show()
        }

        val btnLogin: Button = findViewById<Button>(R.id.button2)

        btnLogin.setOnClickListener {
            Toast.makeText(this, "iniciar sesion", Toast.LENGTH_LONG).show()
        }

    }
}