package com.example.addevent.ui.myEvents

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MyEventsViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is myevents Fragment"
    }
    val text: LiveData<String> = _text
}