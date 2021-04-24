package com.example.livedatapractise

import androidx.lifecycle.ViewModel

class LiveDataPractiseViewModel : ViewModel() {
    var currentNumber:Int = 0

    fun numberIncrement(){
        currentNumber++
    }

}