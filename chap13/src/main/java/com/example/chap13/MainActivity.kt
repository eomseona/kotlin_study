package com.example.chap13


import android.os.*
import androidx.appcompat.app.AppCompatActivity
import android.util.Log

import com.example.chap13.databinding.ActivityMainBinding
import kotlin.concurrent.thread
import kotlin.system.measureTimeMillis

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.clickBtn.setOnClickListener {
            thread {
                var sum = 0L
                var time = measureTimeMillis {
                    for (i in 1..10) {
                        SystemClock.sleep(1000)
                        sum += i
                    }

                    runOnUiThread {
                        binding.resultView.text = "sum: $sum"
                    }
                }
                Log.d("kkang", "time: $time")
            }
        }
    }
}