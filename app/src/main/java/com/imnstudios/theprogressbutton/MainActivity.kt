package com.imnstudios.theprogressbutton

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        hella.text = "sfa"

        hella.setOnClickListener {
            hella.showProgress()
            Toast.makeText(this, "hella", Toast.LENGTH_SHORT).show()
        }

    }
}