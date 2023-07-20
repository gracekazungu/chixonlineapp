package com.example.chixproducts

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.chixproducts.databinding.ActivityMain9Binding

class MainActivity9 : AppCompatActivity() {
    lateinit var binding: ActivityMain9Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMain9Binding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    override fun onResume() {
        super.onResume()
        binding.imageView59.setOnClickListener {
            val intent=Intent(this,MainActivity10::class.java)
            startActivity(intent)
        }
        binding.imageView58.setOnClickListener {
            val intent=Intent(this,MainActivity8::class.java)
            startActivity(intent)
        }
        binding.button23.setOnClickListener {
            val intent=Intent(this,MainActivity10::class.java)
            startActivity(intent)

            validateEmail()
            clearErrors()
        }
        binding.imageView57.setOnClickListener {
            val intent=Intent(this,MainActivity::class.java)
            startActivity(intent)


        }

    }
    fun validateEmail(){
        val email=binding.etEmail.text.toString()
        var error=false

        if(email.isBlank()){
            binding.tilEmail.error="Email required"
            error=true
        }
        if (!error){
            Toast.makeText(this,"Login or create an account", Toast.LENGTH_LONG).show()
        }
    }
    fun clearErrors(){
        binding.tilEmail.error = null
    }

}