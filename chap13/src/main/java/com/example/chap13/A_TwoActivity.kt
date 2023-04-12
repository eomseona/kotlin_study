package com.example.chap13

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.chap13.databinding.ActivityAtwoBinding

class A_TwoActivity : AppCompatActivity() {
    lateinit var binding: ActivityAtwoBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAtwoBinding.inflate(layoutInflater)
        setContentView(binding.root)
        title = "Two Activity"

        binding.createActivity.setOnClickListener{
            val intent = Intent(this, A_TwoActivity::class.java)
            intent.flags = Intent.FLAG_ACTIVITY_SINGLE_TOP
            startActivity(intent)
        }
    }

    override fun onNewIntent(intent: Intent?) {
        super.onNewIntent(intent)
        Toast.makeText(applicationContext, "New Intent", Toast.LENGTH_SHORT).show()
    }
}