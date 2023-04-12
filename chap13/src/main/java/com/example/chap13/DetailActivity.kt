package com.example.chap13

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.widget.Toast
import androidx.activity.result.ActivityResultLauncher
import androidx.activity.result.contract.ActivityResultContracts
import com.example.chap13.databinding.ActivityDetailBinding
import com.example.chap13.databinding.ActivityMainBinding

class DetailActivity : AppCompatActivity() {
    lateinit var binding: ActivityDetailBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)
        title = "Detail Activity"

        binding.finishBtn.setOnClickListener {
            val intent = Intent()
            intent.putExtra("result", "world")
            setResult(RESULT_OK, intent)
            finish()
        }
        binding.packageInfo.setOnClickListener {
            val packageInfo = packageManager.getPackageInfo("com.example.chap13", 0)
            Toast.makeText(this, "Package Info:${packageInfo.versionName}",Toast.LENGTH_SHORT).show()
        }
    }
}