package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.RadioButton

class MainActivity : AppCompatActivity() {
    private lateinit var okButton: Button
    private lateinit var dollarButton: RadioButton
    private lateinit var euroButton: RadioButton
    private lateinit var poundButton: RadioButton
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        okButton = findViewById(R.id.buttonOk)
        dollarButton = findViewById(R.id.radioDollar)
        euroButton = findViewById(R.id.radioEuro)
        poundButton = findViewById(R.id.radioPound)
        okButton.setOnClickListener {

        }
    }
}