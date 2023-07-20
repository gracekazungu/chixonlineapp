package com.example.chixproducts

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.chixproducts.databinding.ActivityMain8Binding

class MainActivity8 : AppCompatActivity() {
    lateinit var binding: ActivityMain8Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMain8Binding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    override fun onResume() {
        super.onResume()
        binding.imageView56.setOnClickListener {
            val intent=Intent(this,MainActivity9::class.java)
            startActivity(intent)
        }
        binding.imageView55.setOnClickListener {
            val intent=Intent(this,MainActivity7::class.java)
            startActivity(intent)
        }
        binding.imageView16.setOnClickListener {
            val intent=Intent(this,MainActivity::class.java)
            startActivity(intent)
        }
    }
}