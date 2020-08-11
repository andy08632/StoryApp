package com.example.storyapp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageButton
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController

class CreateStory : Fragment(){
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.edit, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        println(R.id.button_Story);
        view.findViewById<ImageButton>(R.id.back).setOnClickListener {
            findNavController().navigate(R.id.action_CreateStory_to_SecondFragment)
        }
    }
}
