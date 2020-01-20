package com.example.addevent.ui.addEvent

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class AddEventViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is addevent Fragment"
    }
    val text: LiveData<String> = _text
}