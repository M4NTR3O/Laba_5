package com.example.myapplication

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.RadioButton
import android.widget.TextView
import org.w3c.dom.Text

class ResultActivity : AppCompatActivity() {
    private lateinit var textInput: TextView
    private lateinit var textOutput: TextView
    private lateinit var textValue: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

    }
}