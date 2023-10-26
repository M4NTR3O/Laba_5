package com.example.myapplication

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

private const val COST_TEXT = "input_cost"
private const val DOLLAR = "dollar"
private const val EURO = "euro"
private const val POUND = "pound"
class ResultActivity : AppCompatActivity() {
    private lateinit var textInput: TextView
    private lateinit var textOutput: TextView
    private lateinit var textValue: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)
        textInput = findViewById(R.id.textInput)
        textOutput = findViewById(R.id.textOutput)
        textValue = findViewById(R.id.textValute)
        textInput.text = intent.getStringExtra(COST_TEXT)
        when{
            intent.getBooleanExtra(DOLLAR, false) -> textValue.text = "$"
            intent.getBooleanExtra(EURO, false) -> textValue.text = "€"
            intent.getBooleanExtra(POUND, false) -> textValue.text = "£"
        }
    }
    companion object{
        fun newIntent(packageContext: Context, cost_text: String, isDollar: Boolean, isEuro: Boolean, isPound: Boolean): Intent{
            return Intent(packageContext, ResultActivity::class.java).apply {
                putExtra(COST_TEXT, cost_text)
                putExtra(DOLLAR, isDollar)
                putExtra(EURO, isEuro)
                putExtra(POUND, isPound)
            }
        }
    }
}