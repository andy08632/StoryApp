package com.example.storyapp

import android.R.attr
import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController


/**
 * A simple [Fragment] subclass as the default destination in the navigation.
 */
class FirstFragment: Fragment() {
    private val REQUEST_CODE = 100
    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?

    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_first, container, false)
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.findViewById<Button>(R.id.button_first).setOnClickListener {
            print("running")
            pickImageFromGallery()

                //findNavController().navigate(R.id.action_FirstFragment_to_SecondFragment)

        }
        view.findViewById<Button>(R.id.button_test).setOnClickListener{
            findNavController().navigate(R.id.action_story)
        }
    }


    private fun pickImageFromGallery() {
        val intent = Intent()
        intent.type = "image/*"
        intent.action = Intent.ACTION_GET_CONTENT
        startActivityForResult(Intent.createChooser(intent, "Select Picture"), 100)

//        val intent = Intent()
//        intent.type = "image/*"
//        intent.action = Intent.ACTION_GET_CONTENT //
//
//        startActivityForResult(Intent.createChooser(intent, "Select File"), 100)
//        println("data is: "+intent)
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, intentData: Intent?) {
        println("firstFragment")

        if (resultCode == Activity.RESULT_OK && requestCode == 100){
            if (resultCode == Activity.RESULT_OK && requestCode == REQUEST_CODE){
                println("here")
                var url : String = ""
                url = intentData?.data.toString()
                println("url is : $url")
                println("URL: "+intentData?.data)
                DataAdapter.shareDataUri = intentData?.data
                //current.data = url
                //print(current.data)
            }
        }
    }




}
