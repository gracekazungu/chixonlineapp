package com.example.chixproducts

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.chixproducts.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }

    override fun onResume() {
        super.onResume()
        binding.tvviewmore.setOnClickListener {
            val intent=Intent(this,MainActivity2::class.java)
            startActivity(intent)
        }
        binding.textView6.setOnClickListener {
            val intent=Intent(this,MainActivity3::class.java)
            startActivity(intent)
        }
        binding.textView8.setOnClickListener {
            val intent=Intent(this,MainActivity4::class.java)
            startActivity(intent)
        }
        binding.textView10.setOnClickListener {
            val intent=Intent(this,MainActivity5::class.java)
            startActivity(intent)
        }
        binding.textView12.setOnClickListener {
            val intent=Intent(this,MainActivity6::class.java)
            startActivity(intent)
        }
        binding.textView14.setOnClickListener {
            val intent=Intent(this,MainActivity2::class.java)
            startActivity(intent)
        }
        binding.textView16.setOnClickListener {
            val intent=Intent(this,MainActivity2::class.java)
            startActivity(intent)
        }
        binding.imageView14.setOnClickListener {
            val intent=Intent(this,MainActivity2::class.java)
            startActivity(intent)
        }
        binding.textView18.setOnClickListener {
            val intent=Intent(this,MainActivity7::class.java)
            startActivity(intent)
        }
    }
}


