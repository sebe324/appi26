package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.core.widget.addTextChangedListener
import com.example.myapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private  lateinit var binding: ActivityMainBinding
    private var counter: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var message = Toast.makeText(applicationContext, "Hello!!!", Toast.LENGTH_SHORT)

        binding.incrementBtn.setOnClickListener {
            binding.counter.text = (++counter).toString()
            message.show()
        }
        binding.decrementButton.setOnClickListener {
            binding.counter.text = (--counter).toString()
        }
        binding.openCalculatorButton.setOnClickListener {
            val intent = Intent(this@MainActivity, CalculatorActivity::class.java)
            startActivity(intent)
        }
    }
}