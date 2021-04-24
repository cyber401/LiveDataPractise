package com.example.livedatapractise

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class LiveDataPractiseViewModel : ViewModel() {
    private val liveData = MutableLiveData<Int>()
    private var currentNumber:Int = 0

    fun value(): LiveData<Int> {
        liveData.value = currentNumber
        return liveData
    }

    fun numberIncrement(){
        currentNumber++
        liveData.value = currentNumber
    }

}