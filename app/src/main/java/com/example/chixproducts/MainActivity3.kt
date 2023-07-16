package com.example.chixproducts

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.chixproducts.databinding.ActivityMain3Binding

class MainActivity3 : AppCompatActivity() {
    lateinit var binding: ActivityMain3Binding

        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            binding= ActivityMain3Binding.inflate(layoutInflater)

            setContentView(binding.root)
//                    setContentView(R.layout.activity_main3)

        }
        override fun onResume() {
            super.onResume()
            binding.imageView31.setOnClickListener {
                val intent= Intent(this,MainActivity::class.java)
                startActivity(intent)
            }
            binding.imageView38.setOnClickListener {
                val intent= Intent(this,MainActivity2::class.java)
                startActivity(intent)
            }
            binding.imageView40.setOnClickListener {
                val intent= Intent(this,MainActivity4::class.java)
                startActivity(intent)
            }

        }
}