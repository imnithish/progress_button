package com.imnstudios.library

import android.content.Context
import android.util.AttributeSet
import android.util.TypedValue
import android.view.LayoutInflater
import android.view.View
import android.widget.ProgressBar
import android.widget.RelativeLayout
import android.widget.TextView
import androidx.core.content.ContextCompat
import androidx.core.graphics.red

class ProgressButton(context: Context, attrs: AttributeSet) : RelativeLayout(context, attrs) {

    private var progressBar: ProgressBar? = null
    private var textView: TextView? = null
    var text: CharSequence?
        get() {
            return textView?.text
        }
        set(value) {
            textView?.text = value
        }

    init {

        val inflater = context
            .getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
        val rootView = inflater.inflate(R.layout.spinner_button, this, true)

        textView = rootView.findViewById(R.id.textView)
        progressBar = rootView.findViewById(R.id.progressBar)

        val a = context.obtainStyledAttributes(
            attrs,
            R.styleable.ProgressButton, 0, 0
        )
        a.recycle()

        textView?.apply {
            text = a.getString(R.styleable.ProgressButton_text) ?: ""
            setTextColor(ContextCompat.getColor(context, R.color.primaryTextColor))
            setTextSize(TypedValue.COMPLEX_UNIT_SP, 17f)
        }
    }

    fun showProgress() {
        textView?.visibility = View.INVISIBLE
        progressBar?.visibility = View.VISIBLE
    }

    fun hideProgress() {
        textView?.visibility = View.VISIBLE
        progressBar?.visibility = View.INVISIBLE
    }

    override fun setOnClickListener(onClick: OnClickListener?) {
        rootView?.setOnClickListener(onClick)
    }

}