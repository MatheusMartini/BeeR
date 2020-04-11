package com.example.beer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button_calculate.setOnClickListener(View.OnClickListener {
            val preco1 = price1.text.toString()
            val preco2 = price2.text.toString()
            val preco3 = price3.text.toString()
            val mL1 = ml1.text.toString()
            val mL2 = ml2.text.toString()
            val mL3 = ml3.text.toString()
            var i=0;

            if (preco1.isEmpty() && mL1.isEmpty()) {
                final1.text = getString(R.string.textView_final)
            } else if (preco1.isEmpty()) {
                Toast.makeText(this, getString(R.string.error_priceMissing), Toast.LENGTH_LONG)
                    .show()
            } else if (mL1.isEmpty()) {
                Toast.makeText(this, getString(R.string.error_mlMissing), Toast.LENGTH_LONG).show()
            } else final1.text = ML.calculate(preco1.toDouble(), mL1.toDouble())

            if (preco2.isEmpty() && mL2.isEmpty()) {
                final2.text = getString(R.string.textView_final)
            } else if (preco2.isEmpty()) {
                Toast.makeText(this, getString(R.string.error_priceMissing), Toast.LENGTH_LONG)
                    .show()
            } else if (mL2.isEmpty()) {
                Toast.makeText(this, getString(R.string.error_mlMissing), Toast.LENGTH_LONG).show()
            } else final2.text = ML.calculate(preco2.toDouble(), mL2.toDouble())

            if (preco3.isEmpty() && mL3.isEmpty()) {
                final3.text = getString(R.string.textView_final)
            } else if (preco3.isEmpty()) {
                Toast.makeText(this, getString(R.string.error_priceMissing), Toast.LENGTH_LONG)
                    .show()
            } else if (mL3.isEmpty()) {
                Toast.makeText(this, getString(R.string.error_mlMissing), Toast.LENGTH_LONG).show()
            } else final3.text = ML.calculate(preco3.toDouble(), mL3.toDouble())

        })
    }
}