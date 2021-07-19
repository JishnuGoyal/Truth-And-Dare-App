package com.example.truthanddaresample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.truthanddaresample.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    val numbers = listOf<Int>(1,2)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        initialiseBinding()

        binding.btnTruthOrDare.setOnClickListener {
            truthOrDare()

        }
    }

    private fun truthOrDare() {
        val result = numbers.random()
        if (result == 1){
            binding.truthOrDareTextView.text = "Truth"
        }else if (result == 2){
            binding.truthOrDareTextView.text = "Dare"
        }
    }


    private fun initialiseBinding(){
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
    }
}