package com.example.facebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.facebook.databinding.ActivityMainBinding

class Signup : AppCompatActivity() {
    lateinit var text:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_signup)
        supportActionBar?.hide()

        text=findViewById<TextView>(R.id.txt)

        text.setOnClickListener {
            var intent= Intent(this,MainActivity::class.java)
            startActivity(intent)
        }
    }
}