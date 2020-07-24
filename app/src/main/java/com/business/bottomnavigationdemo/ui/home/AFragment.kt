package com.business.bottomnavigationdemo.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import com.business.bottomnavigationdemo.R

/**
 * Created by claire on 2020/7/23.
 */
class AFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.a_fragment, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val btnNextD = view.findViewById<Button>(R.id.btn_next_D);
        btnNextD.setOnClickListener { v ->
            //官方推荐使用Safe Args的插件用于导航的数据传递
            //也可以使用Bundle的方式
            val bundle = bundleOf("AA" to "Hello", "BB" to " World")

            Navigation.findNavController(v).navigate(R.id.action_AFragment_to_CFragment, bundle);
        }
    }
}