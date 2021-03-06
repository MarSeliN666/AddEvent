package com.example.addevent.ui.addEvent

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.example.addevent.R

class AddEventFragment : Fragment() {

    private lateinit var addEventViewModel: AddEventViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        addEventViewModel =
            ViewModelProviders.of(this).get(AddEventViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_addevent, container, false)

        return root
    }
}