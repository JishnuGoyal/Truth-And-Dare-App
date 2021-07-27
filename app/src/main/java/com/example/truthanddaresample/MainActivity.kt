package com.example.truthanddaresample

import android.animation.Animator
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.truthanddaresample.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        initialiseBinding()

        binding.truthOrDareTextView.setOnClickListener {
            startAnimation()
        }
    }

    private fun truthOrDare() {

        val array = arrayListOf<Int>(1, 2)
        val result = array.random()

        if (result == 1) {
            binding.truthOrDareTextView.text = "Truth"
        } else if (result == 2) {
            binding.truthOrDareTextView.text = "Dare"
        }

    }

    private fun startAnimation() {
        binding.btnTruthOrDare.setMaxProgress(0.2f)
        binding.btnTruthOrDare.playAnimation()

        binding.btnTruthOrDare.addAnimatorListener(object : Animator.AnimatorListener {
            override fun onAnimationStart(animation: Animator?) {
                binding.truthOrDareTextView.text = "..."
            }

            override fun onAnimationEnd(animation: Animator?) {
                truthOrDare()
            }

            override fun onAnimationCancel(animation: Animator?) {
            }

            override fun onAnimationRepeat(animation: Animator?) {

            }

        })


    }


    private fun initialiseBinding() {
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
    }
}