package com.example.storyapp
import android.app.Activity
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TableRow
import androidx.core.view.isVisible
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController
import com.example.storyapp.R.layout.edit
import kotlinx.android.synthetic.main.edit.*
import kotlinx.android.synthetic.main.fragment_first.*
import java.net.URI


class CreateStoryFragment() : Fragment(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(edit, container, false)
    }

    override fun onStart() {
        super.onStart()
        val uri = DataAdapter.shareDataUri

        if(uri!=null){
            println("uri is : $uri")
            val imageURI = view?.findViewById<ImageView>(R.id.savedImageView)?.setImageURI(uri)
            println("data adapter:" + DataAdapter.shareDataUri)

        }
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        var imageFlag : Boolean = true;
        println(R.id.button_Story);

        view.findViewById<ImageButton>(R.id.back).setOnClickListener {
            findNavController().navigate(R.id.action_CreateStory_to_SecondFragment)
        }
        view.findViewById<ImageView>(R.id.savedImageView).setOnClickListener{
            if(imageFlag){
                view.findViewById<TableRow>(R.id.tableRow1).visibility = View.INVISIBLE
                view.findViewById<TableRow>(R.id.tableRow2).visibility = View.INVISIBLE

            }else{
                view.findViewById<TableRow>(R.id.tableRow1).visibility = View.VISIBLE
                view.findViewById<TableRow>(R.id.tableRow2).visibility = View.VISIBLE
            }
            imageFlag = !imageFlag
        }
        view.findViewById<Button>(R.id.button5).setOnClickListener{
            findNavController().navigate(R.id.action_edit_image)
        }


    }

//    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
//        println("ran onActivityResult")
//        println("in createStory")
//        val IMAGE_PICK_CODE = 100
//        println(resultCode);
//        println(resultCode == Activity.RESULT_OK && requestCode == IMAGE_PICK_CODE)
//        if (resultCode == Activity.RESULT_OK && requestCode == IMAGE_PICK_CODE){
//
//            savedImageView.setImageURI(data?.data)
//        }
//    }
}
