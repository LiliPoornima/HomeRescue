package com.example.homerescuenw

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_login)
        //logonlog
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.loginlogbtn)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        //logonsign
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.loginsignbtn)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        //loginlog
        val btnloginlog: Button = findViewById(R.id.loginlogbtn)
        btnloginlog.setOnClickListener {
            val intent = Intent(this, Home::class.java)
            startActivity(intent)
        }

        //loginsign
        val btnloginsign: Button = findViewById(R.id.loginsignbtn)
        btnloginsign.setOnClickListener {
            val intent = Intent(this, Signup
            ::class.java)
            startActivity(intent)
        }
    }
}