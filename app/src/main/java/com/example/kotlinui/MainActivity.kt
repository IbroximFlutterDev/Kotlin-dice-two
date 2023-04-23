package com.example.kotlinui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

import java.util.Random

class MainActivity : AppCompatActivity() {

    lateinit var diceImage:ImageView
    lateinit var diceImage2:ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollButton:Button = findViewById(R.id.roll_button)
        diceImage = findViewById(R.id.dice_image)
        diceImage2 = findViewById(R.id.dice_image2)
        rollButton.setOnClickListener{
            rollDice()
        }


    }

    private fun rollDice() {

        val drawableImage = when(Random().nextInt(6)+1){
            1-> R.drawable.dice1
            2-> R.drawable.dice2
            3-> R.drawable.dice3
            4-> R.drawable.dice4
            5-> R.drawable.dice5
            else -> R.drawable.dice6
        }
        val drawableImage2 = when(Random().nextInt(6)+1){
            1-> R.drawable.dice1
            2-> R.drawable.dice2
            3-> R.drawable.dice3
            4-> R.drawable.dice4
            5-> R.drawable.dice5
            else -> R.drawable.dice6
        }

        diceImage.setImageResource(drawableImage)
        diceImage2.setImageResource(drawableImage2)
    }
}