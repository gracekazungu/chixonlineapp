package com.example.chixproducts

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.chixproducts.databinding.ActivityMain7Binding

class MainActivity7 : AppCompatActivity() {
    lateinit var binding: ActivityMain7Binding

        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            binding= ActivityMain7Binding.inflate(layoutInflater)
            setContentView(binding.root)
        }
        override fun onResume() {
            super.onResume()
            binding.imageView29.setOnClickListener {
                val intent= Intent(this,MainActivity::class.java)
                startActivity(intent)
            }
            binding.imageView32.setOnClickListener {
                val intent= Intent(this,MainActivity6::class.java)
                startActivity(intent)
            }
            binding.imageView30.setOnClickListener {
                val intent= Intent(this,MainActivity8::class.java)
                startActivity(intent)
            }

        }
}