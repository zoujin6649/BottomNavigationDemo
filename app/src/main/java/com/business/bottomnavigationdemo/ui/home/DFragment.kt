package com.business.bottomnavigationdemo.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import com.business.bottomnavigationdemo.R

/**
 * Created by claire on 2020/7/23.
 */
class DFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.d_fragment, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val btnNextF = view.findViewById<Button>(R.id.btn_next_E)
        btnNextF.setOnClickListener { v ->
            Navigation.findNavController(v).navigate(R.id.action_DFragment_to_EFragment)
        }
    }
}