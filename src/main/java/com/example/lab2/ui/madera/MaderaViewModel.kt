package com.example.lab2.ui.madera

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MaderaViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is madera Fragment"
    }
    val text: LiveData<String> = _text
}