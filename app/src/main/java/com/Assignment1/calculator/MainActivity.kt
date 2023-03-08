package com.Assignment1.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

var buttonPressed = ""
var operation = ""
var buttonNumber1 = 0
var buttonNumber2 = 0
var awnser = 0
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button0: Button = findViewById(R.id.button0)
        val button1: Button = findViewById(R.id.button1)
        val button2: Button = findViewById(R.id.button2)
        val button3: Button = findViewById(R.id.button3)
        val button4: Button = findViewById(R.id.button4)
        val button5: Button = findViewById(R.id.button5)
        val button6: Button = findViewById(R.id.button6)
        val button7: Button = findViewById(R.id.button7)
        val button8: Button = findViewById(R.id.button8)
        val button9: Button = findViewById(R.id.button9)
        val buttonAdd: Button = findViewById(R.id.buttonAdd)
        val buttonSub: Button = findViewById(R.id.buttonMin)
        val buttonMul: Button = findViewById(R.id.buttonMul)
        val buttonDiv: Button = findViewById(R.id.buttonDiv)
        val buttonEqu: Button = findViewById(R.id.buttonEqual)
        val buttonClear: Button = findViewById(R.id.buttonAC)


        val textView: TextView = findViewById(R.id.textView3)
        button0.setOnClickListener{buttonPressed += "0"
            textView.text = buttonPressed.toString()}
        button1.setOnClickListener{buttonPressed += "1"
            textView.text = buttonPressed.toString()}
        button2.setOnClickListener{buttonPressed += "2"
            textView.text = buttonPressed.toString()}
        button3.setOnClickListener{buttonPressed += "3"
            textView.text = buttonPressed.toString()}
        button4.setOnClickListener{buttonPressed += "4"
            textView.text = buttonPressed.toString()}
        button5.setOnClickListener{buttonPressed += "5"
            textView.text = buttonPressed.toString()}
        button6.setOnClickListener{buttonPressed += "6"
            textView.text = buttonPressed.toString()}
        button7.setOnClickListener{buttonPressed += "7"
            textView.text = buttonPressed.toString()}
        button8.setOnClickListener{buttonPressed += "8"
            textView.text = buttonPressed.toString()}
        button9.setOnClickListener{buttonPressed += "9"
            textView.text = buttonPressed.toString()}
        buttonAdd.setOnClickListener{operation = "+"
            textView.text = operation.toString()
            changeToNumber1()
            }
        buttonSub.setOnClickListener{operation = "-"
            textView.text = operation.toString()
            changeToNumber1()}
        buttonMul.setOnClickListener{operation = "*"
            textView.text = operation.toString()
            changeToNumber1()}
        buttonDiv.setOnClickListener{operation = "/"
            textView.text = operation.toString()
            changeToNumber1()}
        buttonEqu.setOnClickListener{changeToNumber2()
            eval()
            textView.text= awnser.toString()}
        buttonClear.setOnClickListener{buttonPressed = ""
        operation = ""
        buttonNumber1 = 0
        buttonNumber2 = 0
        textView.text = buttonPressed.toString()}












    }

    private fun changeToNumber1() {
        buttonNumber1 = buttonPressed.toInt()
        buttonPressed = ""
    }

    private fun changeToNumber2(){
        buttonNumber2 = buttonPressed.toInt()
    }
    private fun eval(){
        val op = when(operation){
            "+" -> awnser = buttonNumber1 + buttonNumber2
            "-" -> awnser = buttonNumber1 - buttonNumber2
            "*" -> awnser = buttonNumber1 *buttonNumber2
            "/" -> awnser = buttonNumber1/ buttonNumber2
            "%" -> awnser = buttonNumber1% buttonNumber2
            else -> awnser = 0
        }


    }

}