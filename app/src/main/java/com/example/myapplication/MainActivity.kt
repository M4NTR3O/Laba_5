package com.example.myapplication

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private lateinit var okButton: Button
    private lateinit var dollarButton: RadioButton
    private lateinit var euroButton: RadioButton
    private lateinit var poundButton: RadioButton
    private lateinit var costText: TextView
    private lateinit var valuteGroup: RadioGroup
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        okButton = findViewById(R.id.buttonOk)
        dollarButton = findViewById(R.id.radioDollar)
        euroButton = findViewById(R.id.radioEuro)
        poundButton = findViewById(R.id.radioPound)
        costText = findViewById(R.id.costText)
        valuteGroup = findViewById(R.id.radioGroup)
        okButton.setOnClickListener {
            val costtext = costText.text.toString()
            val dollarChecked = dollarButton.isChecked
            val euroChecked = euroButton.isChecked
            val poundChecked = poundButton.isChecked
            val intent = ResultActivity.newIntent(this@MainActivity, costtext)
            startActivity(intent)
        }
        valuteGroup.setOnCheckedChangeListener(){_, checkedId->
            if(costText.text.length > 0){
                okButton.visibility = View.VISIBLE
            }
        }
    }
}