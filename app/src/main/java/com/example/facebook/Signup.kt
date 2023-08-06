package com.example.facebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.facebook.databinding.ActivityMainBinding

class Signup : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportActionBar?.hide()
        binding.text3.setOnClickListener {


            var intent= Intent(this,MainActivity::class.java)
            startActivity(intent)
        }
    }
}