package com.example.addevent.ui.myEvents

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProviders
import com.example.addevent.R

class MyEventsFragment : Fragment() {

    private lateinit var myEventsViewModel: MyEventsViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        myEventsViewModel =
            ViewModelProviders.of(this).get(MyEventsViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_myevents, container, false)

        return root
    }
}