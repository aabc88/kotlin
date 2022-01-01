package com.example.kotlinpractice.android

import android.os.Bundle
import android.os.SystemClock
import androidx.appcompat.app.AppCompatActivity
import com.example.kotlinpractice.databinding.ActivityStopWatchBinding

class StopWatchActivity : AppCompatActivity() {
    var initTime = 0L
    var pauseTime = 0L

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityStopWatchBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btn1.setOnClickListener {
            binding.btn2.isEnabled = true
            binding.btn3.isEnabled = true
            binding.btn1.isEnabled = false
            binding.ch1
                .base = SystemClock.elapsedRealtime()+pauseTime
            binding.ch1.start()
        }

        binding.btn2.setOnClickListener {
            binding.btn1.isEnabled = true
            binding.btn3.isEnabled = true
            binding.btn2.isEnabled = false
            pauseTime = binding.ch1.base - SystemClock.elapsedRealtime()
            binding.ch1.stop()

        }

        binding.btn3.setOnClickListener {
            binding.btn2.isEnabled = true
            binding.btn1.isEnabled = true
            binding.btn3.isEnabled = false
        }


    }

    override fun onDestroy() {
        super.onDestroy()
    }
}