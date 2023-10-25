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
            val intent = Intent(this, ResultActivity::class.java)
            intent.putExtra("input_cost", costText.text)
            intent.putExtra("dollar", dollarButton.isChecked)
            intent.putExtra("euro", euroButton.isChecked)
            intent.putExtra("pound", poundButton.isChecked)
            startActivity(intent)
        }
    }
}