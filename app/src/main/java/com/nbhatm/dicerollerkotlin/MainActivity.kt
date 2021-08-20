package com.nbhatm.dicerollerkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // Until this function call is triggered, views of the layout are not inflated.
        // As they are not inflated, they are not available in the memory.

        val rollBtn: Button = findViewById(R.id.roll_btn)
        val diceImage: ImageView = findViewById(R.id.dice_image)

        rollBtn.setOnClickListener(View.OnClickListener {
            val drawableResource = when (rollDice()) {
                1 -> R.drawable.dice_1
                2 -> R.drawable.dice_2
                3 -> R.drawable.dice_3
                4 -> R.drawable.dice_4
                5 -> R.drawable.dice_5
                else -> R.drawable.dice_6
            }
            diceImage.setImageResource(drawableResource)
        })
    }

    private fun rollDice(): Int {
        return Random.nextInt(6) + 1
    }
}