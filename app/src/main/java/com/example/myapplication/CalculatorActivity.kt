package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import androidx.core.widget.addTextChangedListener
import com.example.myapplication.databinding.CalculatorBinding

class CalculatorActivity : AppCompatActivity(){
    private var a: String="0"
    private var b: String="0"
    private var x: Boolean=true
    private var num1: Float=0f
    private var num2: Float=0f
    private  lateinit var binding: CalculatorBinding
    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        binding = CalculatorBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button1.setOnClickListener {
            if (x) {
                a = a.plus("1")
                binding.textView.text=a
            } else {
                b = b.plus("1")
                binding.textView.text=b
            }
        }
        binding.button2.setOnClickListener {
            if(x){
                a=a.plus("2")
                binding.textView.text=a
                }
            else{
                b=b.plus("2")
                binding.textView.text=b
            }
        }
        binding.button3.setOnClickListener {
            if(x) {
                a = a.plus("3")
                binding.textView.text=a
            }
            else{
                b=b.plus("3")
                binding.textView.text=b
            }
        }
        binding.button4.setOnClickListener {
            if(x) {
                a = a.plus("4")
                binding.textView.text=a
            }
            else{
                b=b.plus("4")
                binding.textView.text=b
            }
        }
        binding.button5.setOnClickListener {
            if(x) {
                a = a.plus("5")
                binding.textView.text=a
            }
            else {
                b = b.plus("5")
                binding.textView.text=b
            }
        }
        binding.button6.setOnClickListener {
            if(x) {
                a = a.plus("6")
                binding.textView.text=a
            }
            else{
                b=b.plus("6")
                binding.textView.text=b
            }
        }
        binding.button7.setOnClickListener {
            if(x) {
                a = a.plus("7")
                binding.textView.text=a
            }
            else {
                b = b.plus("7")
                binding.textView.text=b
            }
        }
        binding.button8.setOnClickListener {
            if(x) {
                a = a.plus("8")
                binding.textView.text=a
            }
            else{
                b=b.plus("8")
                binding.textView.text=b
            }
        }
        binding.button9.setOnClickListener {
            if(x) {
                a = a.plus("9")
                binding.textView.text=a
            }
            else {
                b = b.plus("9")
                binding.textView.text=b
            }
        }
        binding.button0.setOnClickListener {
            if(x)
                a=a.plus("0")
            else b=b.plus("0")
        }
        binding.buttonadd.setOnClickListener {
            if(x)
            num1=a.toFloat()
            else {
                num2 = a.toFloat()
                a=(num1+num2).toString();
            }
            x=!x
        }
        val intent=intent
    }
}