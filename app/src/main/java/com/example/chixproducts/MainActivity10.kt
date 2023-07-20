package com.example.chixproducts

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.chixproducts.databinding.ActivityMain10Binding

class MainActivity10 : AppCompatActivity() {
    lateinit var binding: ActivityMain10Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMain10Binding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    override fun onResume() {
        super.onResume()
        binding.button24.setOnClickListener {
            val intent=Intent(this,MainActivity11::class.java)
            startActivity(intent)
            validateDetails()
            clearErrors()
        }
        binding.imageView60.setOnClickListener {
            val intent=Intent(this,MainActivity::class.java)
            startActivity(intent)
        }
        binding.imageView61.setOnClickListener {
            val intent=Intent(this,MainActivity8::class.java)
            startActivity(intent)
        }
        binding.imageView62.setOnClickListener {
            val intent=Intent(this,MainActivity11::class.java)
            startActivity(intent)

        }
    }
    fun validateDetails(){
        val firstname=binding.etFirstName.text.toString()
        val lastname=binding.etLastName.text.toString()
        val contact=binding.etPhoneNumber.text.toString()
        val email=binding.etEmail.text.toString()
        val password=binding.etPassword.text.toString()
        val confirmPassword=binding.etConfirmPassword.text.toString()
        var error=false


        if (firstname.isBlank()){
            binding.tilFirstName.error="First name required"
            error=true
        }
        if (lastname.isBlank()){
            binding.tilLastName.error="Last name is required"
            error=true
        }
        if (contact.isBlank()){
            binding.tilPhoneNumber.error="Phone number is required"
            error=true
        }
        if (email.isBlank()){
            binding.tilEmail.error="Email is required"
            error=true
        }
        if (password.isBlank()){
            binding.tilPassword.error="Password is required"
            error=true
        }
        if (confirmPassword != password){
            binding.etConfirmPassword.error="Confirm password should be equal to password"
        }
  if (!error){
      Toast.makeText(this,"Account created successfully", Toast.LENGTH_LONG).show()
  }
    }
    fun clearErrors(){
        binding.tilFirstName.error=null
        binding.tilLastName.error=null
        binding.tilEmail.error=null
        binding.tilPhoneNumber.error=null
        binding.tilPassword.error=null
        binding.etConfirmPassword.error=null

    }
}

