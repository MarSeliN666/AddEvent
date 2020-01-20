package com.example.addevent.ui.achievements

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.example.addevent.R

class AchievementsFragment : Fragment() {

    private lateinit var achievementsViewModel: AchievementsViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        achievementsViewModel =
            ViewModelProviders.of(this).get(AchievementsViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_achievements, container, false)

        return root
    }
}