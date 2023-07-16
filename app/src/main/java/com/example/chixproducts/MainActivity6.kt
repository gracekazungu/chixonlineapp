package com.example.chixproducts

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.chixproducts.databinding.ActivityMain6Binding

class MainActivity6 : AppCompatActivity() {
    lateinit var binding: ActivityMain6Binding

        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            binding= ActivityMain6Binding.inflate(layoutInflater)
            setContentView(binding.root)
        }
        override fun onResume() {
            super.onResume()
            binding.imageView47.setOnClickListener {
                val intent= Intent(this,MainActivity::class.java)
                startActivity(intent)
            }
            binding.imageView49.setOnClickListener {
                val intent= Intent(this,MainActivity5::class.java)
                startActivity(intent)
            }
            binding.imageView51.setOnClickListener {
                val intent= Intent(this,MainActivity7::class.java)
                startActivity(intent)
            }

        }

    }