package com.example.chixproducts

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.chixproducts.databinding.ActivityMain4Binding

class MainActivity4 : AppCompatActivity() {
    lateinit var binding: ActivityMain4Binding


        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            binding= ActivityMain4Binding.inflate(layoutInflater)
            setContentView(binding.root)
        }
        override fun onResume() {
            super.onResume()
            binding.imageView43.setOnClickListener {
                val intent= Intent(this,MainActivity::class.java)
                startActivity(intent)
            }
            binding.imageView44.setOnClickListener {
                val intent= Intent(this,MainActivity3::class.java)
                startActivity(intent)
            }
            binding.imageView46.setOnClickListener {
                val intent= Intent(this,MainActivity5::class.java)
                startActivity(intent)
            }

        }
}