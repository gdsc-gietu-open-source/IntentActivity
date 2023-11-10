package com.example.intentactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //Create an intent to travel to the next activity(page)
        //start the activity of the intent
        //pass a value through that intent to the next activity
    }
}