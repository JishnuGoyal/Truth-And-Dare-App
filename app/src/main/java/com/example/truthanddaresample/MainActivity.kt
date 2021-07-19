package com.example.truthanddaresample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.truthanddaresample.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initialiseBinding()

        binding.btnTruthOrDare.setOnClickListener {
            truthOrDare()
        }
    }

    private fun truthOrDare() {
        val array = arrayListOf<Int>(1,2)
        val result = array.random()

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