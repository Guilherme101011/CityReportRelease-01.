package com.example.cityreportapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

    class MainActivity : AppCompatActivity() {
        private lateinit var Nome: EditText
        private lateinit var Senha: EditText

        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_main)

            // Referencie os elementos do layout
            Nome = findViewById(R.id.Nome_input)
            Senha = findViewById(R.id.Senha_input)
            val loginButton = findViewById<Button>(R.id.Entrar_input)

            // Defina o clique do botão de login
            loginButton.setOnClickListener {
                val username = Nome.text.toString()
                val password = Senha.text.toString()
                val intent = Intent(this,MainActivity2::class.java)
                startActivity(intent)



            }
        }
    }

