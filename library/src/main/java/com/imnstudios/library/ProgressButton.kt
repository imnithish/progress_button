package com.imnstudios.library

import android.content.Context
import android.content.res.ColorStateList
import android.graphics.BlendMode
import android.graphics.BlendModeColorFilter
import android.graphics.Color
import android.graphics.PorterDuff
import android.graphics.drawable.Drawable
import android.os.Build
import android.util.AttributeSet
import android.util.TypedValue
import android.view.LayoutInflater
import android.view.View
import android.widget.Button
import android.widget.ProgressBar
import android.widget.RelativeLayout
import androidx.core.content.res.ResourcesCompat

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

    var backgroundColor: String?
        get() {
            return backgroundColor.toString()
        }
        set(value) {
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.Q) {
                background.colorFilter =
                    BlendModeColorFilter(Color.parseColor(value), BlendMode.SRC_ATOP)
            } else {
                background.setColorFilter(Color.parseColor(value), PorterDuff.Mode.SRC_ATOP)
            }
        }

    var buttonBackground: Drawable?
        get() {
            return background
        }
        set(value) {
            background = value
        }

    var textSize: Float?
        get() {
            return button?.textSize
        }
        set(value) {
            button?.setTextSize(
                TypedValue.COMPLEX_UNIT_SP, value!!
            )
        }

    var progressBarTint: String = "#FFFFFF"
        set(value) {
            progressBar?.indeterminateTintList = ColorStateList.valueOf(Color.parseColor(value))
        }


    init {

        val inflater = context
            .getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
        val rootView = inflater.inflate(R.layout.spinner_button, this, true)

        button = rootView.findViewById(R.id.button)
        progressBar = rootView.findViewById(R.id.progress)

        val a = context.obtainStyledAttributes(
            attrs,
            R.styleable.ProgressButton
        )
        val backgroundColor =
            a.getString(R.styleable.ProgressButton_buttonBackgroundColor) ?: "#BBBDCC"
        val textColor = a.getString(R.styleable.ProgressButton_textColor) ?: "#000000"
        setBackgroundColor(Color.parseColor(backgroundColor))
        button?.apply {
            text = a.getString(R.styleable.ProgressButton_text) ?: ""
            setTextColor(Color.parseColor(textColor))
            setTextSize(
                TypedValue.COMPLEX_UNIT_SP,
                a.getFloat(R.styleable.ProgressButton_textSize, 17f)
            )
            if (a.getBoolean(R.styleable.ProgressButton_textFontFlag, false))
                typeface = ResourcesCompat.getFont(
                    context,
                    a.getResourceId(R.styleable.ProgressButton_textFont, R.font.poppins_bold)
                )
        }
        progressBar?.indeterminateTintList = ColorStateList.valueOf(
            Color.parseColor(
                a.getString(R.styleable.ProgressButton_progressBarTint) ?: "#FFFFFF"
            )
        )

//        progressBar?.layoutParams = LayoutParams(
//            a.getInteger(R.styleable.ProgressButton_progressBarSize, 35),
//            a.getInteger(R.styleable.ProgressButton_progressBarSize, 35)
//        )

        a.recycle()
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
        button?.setOnClickListener(onClick)
    }

}