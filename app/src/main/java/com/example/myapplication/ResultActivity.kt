package com.example.myapplication

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.RadioButton
import android.widget.TextView
import org.w3c.dom.Text

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
        setContentView(R.layout.activity_main2)
        textInput.text = intent.getStringExtra(COST_TEXT)
        var result: Double = intent.getStringExtra(COST_TEXT)!!.toDouble()
        when{
            intent.getBooleanExtra(DOLLAR, false) -> {
                textValue.setText("$")
                result *= 75
            }
            intent.getBooleanExtra(EURO, false) -> {
                textValue.setText("€")
                result *= 90
            }
            intent.getBooleanExtra(POUND, false) -> {
                textValue.setText("£")
                result *= 100
            }
            else -> {
                textValue.setText("₽")
            }
        }
        textOutput.setText(result.toString())
    }
    companion object {
        fun newIntent(packageContext: Context, costtext: CharSequence, dollarChecked: Boolean, euroChecked: Boolean, poundChecked: Boolean): Intent {
            return Intent(packageContext,
                ResultActivity::class.java).apply {
                putExtra(COST_TEXT, costtext)
                putExtra(DOLLAR, dollarChecked)
                putExtra(EURO, euroChecked)
                putExtra(POUND, poundChecked)
            }
        }
    }
}