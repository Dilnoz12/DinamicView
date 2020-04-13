package com.example.dinamicview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.widget.Button
import android.widget.LinearLayout
import android.widget.ScrollView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val linearLayout: LinearLayout = LinearLayout(this)
        setContentView(linearLayout)
        linearLayout.orientation = LinearLayout.VERTICAL
        val outLayout = LinearLayout(this)
        outLayout.orientation = LinearLayout.HORIZONTAL
        linearLayout.addView(outLayout)


        val outlayoutLP = LinearLayout.LayoutParams(
            LinearLayout.LayoutParams.MATCH_PARENT,
            LinearLayout.LayoutParams.WRAP_CONTENT
        )
        outLayout.layoutParams = outlayoutLP
        val buttonLeft = Button(this)
        buttonLeft.text = "Left"

        val buttonLeftLP = LinearLayout.LayoutParams(
            LinearLayout.LayoutParams.WRAP_CONTENT,
            LinearLayout.LayoutParams.WRAP_CONTENT
        )
        buttonLeft.layoutParams = buttonLeftLP


        val buttonCenter = Button(this)
        buttonCenter.text = "Center"

        val buttonCenterLP = LinearLayout.LayoutParams(
            LinearLayout.LayoutParams.WRAP_CONTENT,
            LinearLayout.LayoutParams.WRAP_CONTENT
        )

        buttonCenter.layoutParams = buttonCenterLP


        val buttonRight = Button(this)
        buttonRight.text = "Right"

        val buttonRightLP = LinearLayout.LayoutParams(
            LinearLayout.LayoutParams.WRAP_CONTENT,
            LinearLayout.LayoutParams.WRAP_CONTENT
        )
        buttonRight.layoutParams = buttonRightLP

        val buttonClear = Button(this)
        buttonClear.text = "Clear"
        val buttonClearLP = LinearLayout.LayoutParams(
            LinearLayout.LayoutParams.WRAP_CONTENT,
            LinearLayout.LayoutParams.WRAP_CONTENT
        )

        outLayout.addView(buttonLeft)
        outLayout.addView(buttonCenter)
        outLayout.addView(buttonRight)
        outLayout.addView(buttonClear)

        val inLayout = LinearLayout(this)
        inLayout.orientation = LinearLayout.VERTICAL
        val scrollView = ScrollView(this)
        scrollView.addView(inLayout)
        linearLayout.addView(scrollView)
        val button1 = Button(this)
        inLayout.addView(button1)
        buttonLeft.setOnClickListener {
            button1.gravity = Gravity.LEFT


        }
        buttonCenter.setOnClickListener {
            button1.gravity = Gravity.CENTER

        }
        buttonRight.setOnClickListener {
            button1.gravity = Gravity.RIGHT
        }
        buttonClear.setOnClickListener {
            inLayout.removeAllViews()
        }
    }
}
