package com.example.chap06

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.chap06.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.passwordBtn.setOnClickListener{
            Toast.makeText(applicationContext, "암호를 입력했습니다", Toast.LENGTH_SHORT).show()
        }

    }
}