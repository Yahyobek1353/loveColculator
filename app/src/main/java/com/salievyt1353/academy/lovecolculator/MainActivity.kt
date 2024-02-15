package com.salievyt1353.academy.lovecolculator

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.WindowManager
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.salievyt1353.academy.lovecolculator.databinding.ActivityMainBinding


@Suppress("DEPRECATION")
class MainActivity : AppCompatActivity() {
    private val bining : ActivityMainBinding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(bining.root)
        val e = window
        e.setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN
        )

            bining.btnResult.setOnClickListener {
                if (bining.firstName.length() > 2 && bining.secondName.length() > 2) {
                    val rondom = (10..100).random()
                    bining.result.text = "$rondom%"
                }else if (bining.firstName.length() == 0) {
                    Toast.makeText(this, "Введите первое имя", Toast.LENGTH_LONG).show()
                } else if (bining.secondName.length() == 0) {
                    Toast.makeText(this, "Введите второе имя", Toast.LENGTH_LONG).show()
                } else if (bining.firstName.length() == 0 && bining.secondName.length() == 0) {
                    Toast.makeText(this, "Вы не ввели имя", Toast.LENGTH_SHORT).show()
                }
            }
    }
}