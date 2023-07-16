package com.example.chixproducts

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.chixproducts.databinding.ActivityMain5Binding

class MainActivity5 : AppCompatActivity() {
    lateinit var binding: ActivityMain5Binding

    override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
        binding= ActivityMain5Binding.inflate(layoutInflater)
        setContentView(binding.root)
        }
        override fun onResume() {
            super.onResume()
            binding.imageView34.setOnClickListener {
                val intent= Intent(this,MainActivity::class.java)
                startActivity(intent)
            }
            binding.imageView36.setOnClickListener {
                val intent= Intent(this,MainActivity4::class.java)
                startActivity(intent)
            }
            binding.imageView35.setOnClickListener {
                val intent= Intent(this,MainActivity6::class.java)
                startActivity(intent)
            }

        }
}