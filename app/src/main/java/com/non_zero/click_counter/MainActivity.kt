package com.non_zero.click_counter

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private var counter_for_crows: Int = 0
    private var counter_for_cats: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener{
            textView.text = "Hello Kitty"
            it.setBackgroundColor(Color.GREEN)
            counter_for_crows = 0
            counter_for_cats = 0
        }

        button_counter_crows.setOnClickListener{
            textView.text = "I have counted ${counter_for_cats} cats and ${++counter_for_crows} crows"
        }

        button_counter_cats.setOnClickListener{
            textView.text = "I have counted ${++counter_for_cats} cats and ${counter_for_crows} crows"
        }
    }
}
