package com.example.tipcalc

import android.os.Bundle
import android.widget.EditText
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.SeekBar
import android.widget.TextView
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.tipcalc.ui.theme.TipCalcTheme

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val sumOfOrder:EditText = findViewById(R.id.sumOfOrder)
        val countOfDishes:EditText = findViewById(R.id.countOfDishes)
        val valueTips:SeekBar = findViewById(R.id.valueTips)
        val discountButtons:RadioGroup = findViewById(R.id.discountButtons)
        val rb0:RadioButton = findViewById(R.id.rb0)
        val rb1:RadioButton = findViewById(R.id.rb1)
        val rb2:RadioButton = findViewById(R.id.rb2)
        val rb3:RadioButton = findViewById(R.id.rb3)

        val moneyWithDiscount:TextView = findViewById(R.id.moneyWithDiscount)
        val moneyTotal:TextView = findViewById(R.id.moneyTotal)

    }
}