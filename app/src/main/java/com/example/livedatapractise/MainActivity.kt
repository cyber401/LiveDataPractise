package com.example.livedatapractise

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.example.livedatapractise.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding:ActivityMainBinding
    private lateinit var viewModel: LiveDataPractiseViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        viewModel = ViewModelProvider(this).get(LiveDataPractiseViewModel::class.java)
        binding.apply {
            displayNumber.text = viewModel.currentNumber.toString()
            button.setOnClickListener {
                viewModel.numberIncrement()
                    displayNumber.text = viewModel.currentNumber.toString()
            }
        }
    }
}