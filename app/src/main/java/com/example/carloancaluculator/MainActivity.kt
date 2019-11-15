package com.example.carloancaluculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttonCalculate.setOnClickListener(){
            val inputvalue = editTextCarPrice.text.toString()
            val inputvalue1 = editTextDownPayment.text.toString()
            val inputvalue2 = editTextLoanPeriod.text.toString()
            val inputvalue3 = editTextInterestRate.text.toString()

            val value:Double = inputvalue.toDouble()
            val value1:Double = inputvalue1.toDouble()
            val value2:Double = inputvalue2.toDouble()
            val value3:Double = inputvalue3.toDouble()

            val result:Double = value - value1
            val result1:Double = result * (value2 / 100 ) * value3
            val result2:Double = (result + result1)/value3/12

            textViewLoan.text = "%.2f".format(result)
            textViewInterest.text = "%.2f".format(result1)
            textViewMonthlyRepayment.text = "%.2f".format(result2)
        }

            buttonReset.setOnClickListener(){
                editTextCarPrice.setText("")
                editTextDownPayment.setText("")
                editTextLoanPeriod.setText("")
                editTextInterestRate.setText("")
            }

    }
}



