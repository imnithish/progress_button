package com.imnstudios.library

import android.content.Context
import android.graphics.Color
import android.util.AttributeSet
import android.util.TypedValue
import android.view.LayoutInflater
import android.view.View
import android.widget.Button
import android.widget.ProgressBar
import android.widget.RelativeLayout

class ProgressButton(context: Context, attrs: AttributeSet) : RelativeLayout(context, attrs) {

    private var progressBar: ProgressBar? = null
    private var button: Button? = null

    var text: CharSequence?
        get() {
            return button?.text
        }
        set(value) {
            button?.text = value
        }

    var backgroundColor: String = "#BBBDCC"
        set(value) {
            setBackgroundColor(Color.parseColor(value))
        }


    init {

        val inflater = context
            .getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
        val rootView = inflater.inflate(R.layout.spinner_button, this, true)

        button = rootView.findViewById(R.id.button)
        progressBar = rootView.findViewById(R.id.progress)

        val a = context.obtainStyledAttributes(
            attrs,
            R.styleable.ProgressButton)
        a.recycle()

        val backgroundColor =
            a.getString(R.styleable.ProgressButton_buttonBackgroundColor) ?: "#BBBDCC"
        setBackgroundColor(Color.parseColor(backgroundColor))

        button?.apply {
            text = a.getString(R.styleable.ProgressButton_text) ?: ""
            val textColor = a.getString(R.styleable.ProgressButton_textColor) ?: "#000000"
            setTextColor(Color.parseColor(textColor))
            setTextSize(TypedValue.COMPLEX_UNIT_SP, 17f)
        }
    }

    fun showProgress() {
        button?.visibility = View.INVISIBLE
        progressBar?.visibility = View.VISIBLE
    }

    fun hideProgress() {
        button?.visibility = View.VISIBLE
        progressBar?.visibility = View.INVISIBLE
    }

    override fun setOnClickListener(onClick: OnClickListener?) {
        rootView?.setOnClickListener(onClick)
    }

}