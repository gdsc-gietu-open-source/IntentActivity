package com.example.intentactivity

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class SecondActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        lateinit var tvName : TextView
        lateinit var tvRoll : TextView

        tvName = findViewById(R.id.name)
        tvRoll= findViewById(R.id.rollno)

        val bundle = intent.extras
        if (bundle != null){
            tvName.text = "Name = ${bundle.getString("name")}"
            tvRoll.text = "RollNo = ${bundle.getString("roll")}"
        }
    }
}