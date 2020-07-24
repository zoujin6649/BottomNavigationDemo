package com.business.bottomnavigationdemo.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import com.business.bottomnavigationdemo.R

class HomeFragment : Fragment() {

    private lateinit var homeViewModel: HomeViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val btnNextA = view.findViewById<Button>(R.id.btn_next_A)
        val btnNextB = view.findViewById<Button>(R.id.btn_next_B)
        val tvInfo = view.findViewById<TextView>(R.id.tv_info)
        btnNextA.setOnClickListener { v ->
            Navigation.findNavController(v).navigate(R.id.action_navigation_home_to_AFragment)
        }
        btnNextB.setOnClickListener { v ->
            Navigation.findNavController(v).navigate(R.id.action_navigation_home_to_BFragment)
        }
    }
}