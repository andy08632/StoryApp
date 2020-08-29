package com.example.storyapp

import android.graphics.Color
import android.media.Image
import android.net.Uri
import android.opengl.Visibility
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import android.widget.Spinner
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController


class EditImageFragment : Fragment() {


    private val spinner_data =
        arrayOf("Term I", "Term II", "Term III")
    var mySpinner: Spinner? = null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val current = inflater.inflate(R.layout.fragment_edit_image, container, false)





        return current
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val languages = resources.getStringArray(R.array.Languages)
        val current = view
        // access the spinner


        val image : Uri? = DataAdapter.shareDataUri
        val imageURI = view.findViewById<ImageView>(R.id.editImage)?.setImageURI(image)
        view.findViewById<ImageButton>(R.id.back_to_story).setOnClickListener{
            findNavController().navigate(R.id.action_edit_to_story)
        }

        view.findViewById<Button>(R.id.adjust).setOnClickListener{
            view.findViewById<TableRow>(R.id.AdjustOptions).visibility = View.VISIBLE
            view.findViewById<TableRow>(R.id.editOptions).visibility = View.GONE
        }
        view.findViewById<Button>(R.id.cancel).setOnClickListener{
            view.findViewById<TableRow>(R.id.AdjustOptions).visibility = View.GONE
            view.findViewById<TableRow>(R.id.editOptions).visibility = View.VISIBLE
            view.findViewById<SeekBar>(R.id.seekBarBrightness).visibility = View.GONE
            view.findViewById<SeekBar>(R.id.seekBarContrast).visibility = View.INVISIBLE
            view.findViewById<SeekBar>(R.id.seekBarSharpness).visibility = View.GONE

        }
        view.findViewById<Button>(R.id.checkmark).setOnClickListener{
            view.findViewById<TableRow>(R.id.AdjustOptions).visibility = View.GONE
            view.findViewById<TableRow>(R.id.editOptions).visibility = View.VISIBLE
            view.findViewById<SeekBar>(R.id.seekBarBrightness).visibility = View.GONE
            view.findViewById<SeekBar>(R.id.seekBarContrast).visibility = View.INVISIBLE
            view.findViewById<SeekBar>(R.id.seekBarSharpness).visibility = View.GONE
        }
        view.findViewById<Button>(R.id.brightness).setOnClickListener{
            view.findViewById<SeekBar>(R.id.seekBarBrightness).visibility = View.VISIBLE
            view.findViewById<SeekBar>(R.id.seekBarContrast).visibility = View.GONE
            view.findViewById<SeekBar>(R.id.seekBarSharpness).visibility = View.GONE
        }
        view.findViewById<Button>(R.id.sharpness).setOnClickListener{
            view.findViewById<SeekBar>(R.id.seekBarBrightness).visibility = View.GONE
            view.findViewById<SeekBar>(R.id.seekBarContrast).visibility = View.GONE
            view.findViewById<SeekBar>(R.id.seekBarSharpness).visibility = View.VISIBLE
        }
        view.findViewById<Button>(R.id.contrast).setOnClickListener{
            view.findViewById<SeekBar>(R.id.seekBarBrightness).visibility = View.GONE
            view.findViewById<SeekBar>(R.id.seekBarContrast).visibility = View.VISIBLE
            view.findViewById<SeekBar>(R.id.seekBarSharpness).visibility = View.GONE
        }
        view.findViewById<Button>(R.id.Doodle).setOnClickListener{
            view.findViewById<TableRow>(R.id.chooseColor).visibility = View.VISIBLE
            view.findViewById<TableRow>(R.id.editOptions).visibility = View.GONE
            view.findViewById<SeekBar>(R.id.seekBarSharpness).visibility = View.GONE
            view.findViewById<SeekBar>(R.id.seekBarBrightness).visibility = View.GONE
            view.findViewById<SeekBar>(R.id.seekBarContrast).visibility = View.GONE
        }
        view.findViewById<ImageButton>(R.id.pickColor).setOnClickListener {
            if(view.findViewById<HorizontalScrollView>(R.id.colorScroll).visibility == View.VISIBLE){
                view.findViewById<HorizontalScrollView>(R.id.colorScroll).visibility = View.GONE

            }else{
                view.findViewById<HorizontalScrollView>(R.id.colorScroll).visibility = View.VISIBLE
                view.findViewById<HorizontalScrollView>(R.id.brushWidth).visibility = View.GONE
            }

        }
        view.findViewById<Button>(R.id.buttonBlue).setOnClickListener{
            view.findViewById<ImageButton>(R.id.pickColor).setColorFilter(Color.BLUE)
            view.findViewById<HorizontalScrollView>(R.id.colorScroll).visibility = View.GONE
        }
        view.findViewById<Button>(R.id.buttonPurple).setOnClickListener{
            view.findViewById<ImageButton>(R.id.pickColor).setColorFilter(Color.argb(255,148,0,211))
            view.findViewById<HorizontalScrollView>(R.id.colorScroll).visibility = View.GONE
        }
        view.findViewById<Button>(R.id.buttonCyan).setOnClickListener{
            view.findViewById<ImageButton>(R.id.pickColor).setColorFilter(Color.argb(255,0,255,255))
            view.findViewById<HorizontalScrollView>(R.id.colorScroll).visibility = View.GONE
        }
        view.findViewById<Button>(R.id.buttonYellow).setOnClickListener{
            view.findViewById<ImageButton>(R.id.pickColor).setColorFilter(Color.argb(255,255,255,0))
            view.findViewById<HorizontalScrollView>(R.id.colorScroll).visibility = View.GONE
        }
        view.findViewById<Button>(R.id.buttonRed).setOnClickListener{
            view.findViewById<ImageButton>(R.id.pickColor).setColorFilter(Color.argb(255,255,0,0))
            view.findViewById<HorizontalScrollView>(R.id.colorScroll).visibility = View.GONE
        }
        view.findViewById<Button>(R.id.buttonGreen).setOnClickListener{
            view.findViewById<ImageButton>(R.id.pickColor).setColorFilter(Color.argb(255,0,128,0))
            view.findViewById<HorizontalScrollView>(R.id.colorScroll).visibility = View.GONE
        }
        view.findViewById<Button>(R.id.buttonMegenta).setOnClickListener{
            view.findViewById<ImageButton>(R.id.pickColor).setColorFilter(Color.argb(255,255,0,255))
            view.findViewById<HorizontalScrollView>(R.id.colorScroll).visibility = View.GONE
        }
        view.findViewById<Button>(R.id.buttonOrange).setOnClickListener{
            view.findViewById<ImageButton>(R.id.pickColor).setColorFilter(Color.argb(255,255,165,0))
            view.findViewById<HorizontalScrollView>(R.id.colorScroll).visibility = View.GONE
        }
        view.findViewById<Button>(R.id.cancel2).setOnClickListener{
            view.findViewById<TableRow>(R.id.chooseColor).visibility = View.GONE
            view.findViewById<TableRow>(R.id.editOptions).visibility = View.VISIBLE
            view.findViewById<HorizontalScrollView>(R.id.colorScroll).visibility = View.GONE
        }
        view.findViewById<Button>(R.id.brushSize).setOnClickListener {
            if(view.findViewById<HorizontalScrollView>(R.id.brushWidth).visibility == View.VISIBLE){
                view.findViewById<HorizontalScrollView>(R.id.brushWidth).visibility = View.GONE

            }else{
                view.findViewById<HorizontalScrollView>(R.id.brushWidth).visibility = View.VISIBLE
                view.findViewById<HorizontalScrollView>(R.id.colorScroll).visibility = View.GONE
            }

        }


    }
}