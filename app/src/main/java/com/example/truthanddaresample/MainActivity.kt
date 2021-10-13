package com.example.truthanddaresample

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.truthanddaresample.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnTruthOrDare.setOnClickListener {
            truthOrDare()

        }
    }

    private fun truthOrDare() {

        val array = arrayListOf(1, 2)
        val result = array.random()

        if (result == 1) {
            binding.truthOrDareTextView.text = "Truth"
        } else if (result == 2) {
            binding.truthOrDareTextView.text = "Dare"
        }

    }

}