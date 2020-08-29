package com.example.storyapp

import android.content.Context
import android.graphics.Canvas
import android.util.AttributeSet
import android.view.View

class myCanvas @JvmOverloads constructor(context: Context,
                                           attrs: AttributeSet? = null, defStyleAttr: Int = 0)
    : View(context, attrs, defStyleAttr) {


    // Called when the view should render its content.
    override fun onDraw(canvas: Canvas?) {
        super.onDraw(canvas)
        // DRAW STUFF HERE
    }
}