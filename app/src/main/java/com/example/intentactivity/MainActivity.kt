package com.example.intentactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    lateinit var etName : TextView
    lateinit var etRoll : TextView
    lateinit var btnSend: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        etName = findViewById(R.id.name)
        etRoll= findViewById(R.id.rollno)
        btnSend = findViewById(R.id.button)

        btnSend.setOnClickListener {

            val bundle = Bundle()
            bundle.putString("name", etName.text.toString())
            bundle.putString("roll", etRoll.text.toString())

            val intent = Intent(this, SecondActivity::class.java)
            intent.putExtras(bundle)
            startActivity(intent)
        }
    }
}