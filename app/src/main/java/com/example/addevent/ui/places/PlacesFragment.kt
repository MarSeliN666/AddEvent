package com.example.addevent.ui.places

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.example.addevent.R

class PlacesFragment : Fragment() {

    private lateinit var placesViewModel: PlacesViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        placesViewModel =
            ViewModelProviders.of(this).get(PlacesViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_places, container, false)

        return root
    }
}