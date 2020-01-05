package com.conceptual.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import java.lang.Math.random
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    lateinit var imageDice: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        imageDice = findViewById(R.id.image_Dice)
        val diceRollButton: Button = findViewById(R.id.diceButton)
        diceRollButton.setOnClickListener { rollDice() }

    }


    private fun rollDice() {

        val drawableResource = when (Random.nextInt(6) + 1) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }

        imageDice.setImageResource(drawableResource)

    }


}
