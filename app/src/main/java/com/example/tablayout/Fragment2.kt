package com.example.tablayout

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.tablayout.databinding.ActivityMainBinding
import com.example.tablayout.databinding.Fragment1Binding

class Fragment2 : Fragment() {


    private lateinit var binding: Fragment1Binding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment1, container, false)
        binding = Fragment1Binding.bind(view)
        return view
    }
}


