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
        var bundle = getIntent().getExtras();
        if (bundle != null) {
            textInput.text = bundle.getString("input_cost")
            var result: Double = bundle.getString("input_cost")!!.toDouble()
            when{
                bundle.getBoolean("dollar") -> {
                    textValue.setText("$")
                    result *= 75
                }
                bundle.getBoolean("euro") -> {
                    textValue.setText("$")
                    result *= 90
                }
                bundle.getBoolean("pound") -> {
                    textValue.setText("$")
                    result *= 100
                }
                else -> {
                    textValue.setText("₽")
                }
            }
            textOutput.setText(result.toString())
        }
    }
}