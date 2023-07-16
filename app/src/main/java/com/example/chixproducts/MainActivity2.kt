package com.example.chixproducts

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.chixproducts.databinding.ActivityMain2Binding

class MainActivity2 : AppCompatActivity() {
    lateinit var binding: ActivityMain2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMain2Binding.inflate(layoutInflater)
//        setContentView(R.layout.activity_main2)

        setContentView(binding.root)
    }
        override fun onResume() {
            super.onResume()
            binding.btnimageView48.setOnClickListener {
                val intent= Intent(this,MainActivity::class.java)
                startActivity(intent)
            }
            binding.imageView48.setOnClickListener {
                val intent= Intent(this,MainActivity3::class.java)
                startActivity(intent)
            }
//            binding.textView8.setOnClickListener {
//                val intent= Intent(this,MainActivity4::class.java)
//                startActivity(intent)
//            }

        }
}