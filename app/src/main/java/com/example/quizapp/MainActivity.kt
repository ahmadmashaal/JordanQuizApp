package com.example.quizapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*
import android.content.Intent

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val startButton: Button = findViewById(R.id.startButton)
        val etName: EditText = findViewById(R.id.etName)

        startButton.setOnClickListener{
            if(etName.text.isEmpty()){
                Toast.makeText(this, "Please Enter Your Name!", Toast.LENGTH_LONG).show()
            }else{
                val intent = Intent(this, QuestionsActivity::class.java)
                intent.putExtra(Constants.USERNAME, etName.text.toString())
                startActivity(intent)
                finish()
            }
        }
    }
}