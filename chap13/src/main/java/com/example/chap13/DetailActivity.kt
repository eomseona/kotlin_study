package com.example.chap13

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.chap13.databinding.ActivityDetailBinding
import com.example.chap13.databinding.ActivityMainBinding

class DetailActivity : AppCompatActivity() {
    lateinit var binding:ActivityDetailBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)
        title = "Detail Activity"

        binding.finishBtn.setOnClickListener {
            var intent = Intent()
            intent.putExtra("resultData",binding.textEdit.text.toString())
            setResult(RESULT_OK,intent)
            finish()
        }
    }
}