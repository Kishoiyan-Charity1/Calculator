package dev.kishoiyan.calculatorassessment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var etTextOne: EditText
    lateinit var etTextTwo: EditText
    lateinit var btnAddition: Button
    lateinit var btnSubtract: Button
    lateinit var btnModulus: Button
    lateinit var btnDivision: Button
    lateinit var tvOutput: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        etTextOne=findViewById(R.id.etTextOne)
        etTextTwo=findViewById(R.id.etTextTwo)
        btnAddition=findViewById(R.id.btnAddition)
        btnSubtract=findViewById(R.id.btnSubtract)
        btnModulus=findViewById(R.id.btnModulus)
        btnDivision=findViewById(R.id.btnDivision)
        tvOutput=findViewById(R.id.tvOutput)


        btnAddition.setOnClickListener {
            var res1 = etTextOne.text.toString().toInt()
            var res2 = etTextTwo.text.toString().toInt()
            addition(res1,res2)


        }

        btnSubtract.setOnClickListener {
            var res1 = etTextOne.text.toString().toInt()
            var res2 = etTextTwo.text.toString().toInt()
           subtract(res1,res2)

        }

        btnModulus.setOnClickListener {
            var res1 = etTextOne.text.toString().toInt()
            var res2 = etTextTwo.text.toString().toInt()
            modulus(res1,res2)

        }

        btnDivision.setOnClickListener {
            var res1 = etTextOne.text.toString().toInt()
            var res2 = etTextTwo.text.toString().toInt()
            division(res1,res2)


        }

    }

    fun addition(res1:Int,res2:Int){
        var result = res1 + res2
        tvOutput.text = result.toString()
    }
    fun subtract(res1:Int,res2:Int){
        var result = res1 - res2
        tvOutput.text = result.toString()
    }
    fun modulus(res1:Int,res2:Int){
        var result = res1 * res2
        tvOutput.text = result.toString()
    }
    fun division(res1:Int,res2:Int){
        var result = res1 / res2
        tvOutput.text = result.toString()
    }

}


