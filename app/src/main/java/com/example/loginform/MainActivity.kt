package com.example.loginform

import android.content.ContentValues.TAG
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import com.example.loginform.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.loginBtn.setOnClickListener {

            if (binding.username.text.isNullOrBlank() || binding.password.text.isNullOrBlank()) {

                Toast.makeText(
                    applicationContext, "Please fill in the missing fields", Toast.LENGTH_LONG
                ).show()

            } else if (binding.username.text.toString().equals("admin")
                    && binding.password.text.toString().equals("admin123"))
            {
                val intent = Intent(this, SecondActivity::class.java)
                startActivity(intent)

            } else Toast.makeText(
                applicationContext, "Please fill in correct information", Toast.LENGTH_LONG
            ).show()
        }
    }
}