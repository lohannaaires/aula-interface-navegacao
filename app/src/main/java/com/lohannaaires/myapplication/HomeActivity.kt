package com.lohannaaires.myapplication

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.lohannaaires.myapplication.databinding.ActivityHomeBinding

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val name = intent.getStringExtra("NAME")

        binding.tvWelcome.text = getString(R.string.welcome, name)
    }
}