package com.rachad.mvp.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import com.rachad.mvp.R
import com.rachad.mvp.pojo._____Model

class MainActivity : AppCompatActivity(), View.OnClickListener, ____View {
    private lateinit var textView: TextView
    lateinit var button: Button
    private lateinit var presenter: _____Presenter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        textView = findViewById(R.id.textView)
        button = findViewById(R.id.button)
        button.setOnClickListener(this)
        presenter = _____Presenter(this)
    }


    override fun onClick(p0: View?) {
        if (p0!!.id == button.id)
            presenter.get____Name()

    }

    override fun onGet____Name(____Name: String) {
        textView.text = ____Name
    }

}