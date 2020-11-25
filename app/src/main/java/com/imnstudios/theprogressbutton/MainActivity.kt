package com.imnstudios.theprogressbutton

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.core.content.ContextCompat
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var i = 1
    var f = 17f
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        login_button.buttonBackground = ContextCompat.getDrawable(this, R.drawable.rounded_background)
        login_button.backgroundColor = "#FF0563"
        login_button.setOnClickListener {
            login_button.text= "Button was clicked!"

//            login_button.textSize = f++
//            i++
//            login_button.progressBarTint = "#FFFFFF"
//            login_button.showProgress()


            login_button.backgroundColor = "#FF0000"

        }

//        baseline.setOnClickListener {
//            login_button.hideProgress()
//        }

    }
}