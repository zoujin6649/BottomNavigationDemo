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

/**
 * Created by claire on 2020/7/23.
 */
class CFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.c_fragment, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val tvInfo = view.findViewById<TextView>(R.id.tv_info)
        val btnBackToMain = view.findViewById<Button>(R.id.btn_back_main)
        tvInfo.text = "${arguments?.getString("AA")} ${arguments?.getString("BB")}"
        btnBackToMain.setOnClickListener { v ->
            Navigation.findNavController(v).navigate(R.id.action_CFragment_to_navigation_home)
        }
    }
}