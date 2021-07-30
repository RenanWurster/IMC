package com.example.imcrenan

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn = findViewById<Button>(R.id.btn)
        val height = findViewById<EditText>(R.id.height)
        val weight = findViewById<EditText>(R.id.weight)
        val result = findViewById<TextView>(R.id.result)






        btn.setOnClickListener {
            val h = height.text.toString().toFloat() / 100
            val w = weight.text.toString().toFloat() 
            val res = w / (h * h)



            if (res < 18.5) {
                result.text = "${"%.2f".format(res)}   \n  \n  Você está abaixo do peso"
            } else if (res >= 18.5 && res < 25) {
                result.text = "${"%.2f".format(res)}  \n  \n  Você está dentro do peso normal"
            } else if (res >= 25 && res < 30) {
                result.text = "${"%.2f".format(res)}  \n   \n  Você está acima do peso"
            } else if (res >= 30 && res < 35) {
                result.text = "${"%.2f".format(res)}  \n  \n  Você está com obesidade grau I"
            } else if (res >= 35 && res < 40) {
                result.text = "${"%.2f".format(res)}  \n  \n   Você está com obesidade grau II (severa)!"
            } else if (res >= 40) {
                result.text = "${"%.2f".format(res)}  \n \n   Você está com obesidade grau III (mórbida)!"


            }
        }
    }
}



