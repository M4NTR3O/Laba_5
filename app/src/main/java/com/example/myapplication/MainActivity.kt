package com.example.myapplication

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.RadioButton
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private lateinit var okButton: Button
    private lateinit var dollarButton: RadioButton
    private lateinit var euroButton: RadioButton
    private lateinit var poundButton: RadioButton
    private lateinit var costText: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        okButton = findViewById(R.id.buttonOk)
        dollarButton = findViewById(R.id.radioDollar)
        euroButton = findViewById(R.id.radioEuro)
        poundButton = findViewById(R.id.radioPound)
        costText = findViewById(R.id.costText)
        okButton.setOnClickListener {
            val cost_text = costText.text.toString()
            val intent = ResultActivity.newIntent(this@MainActivity, cost_text, dollarButton.isChecked, euroButton.isChecked, poundButton.isChecked)
            startActivity(intent)
        }
    }
}