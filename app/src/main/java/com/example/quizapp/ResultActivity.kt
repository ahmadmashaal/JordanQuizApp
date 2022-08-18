package com.example.quizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        val tvName : TextView = findViewById(R.id.tvName)
        val tvScore : TextView = findViewById(R.id.tvScore)
        val finishButton : Button = findViewById(R.id.finishButton)


        tvName.text = intent.getStringExtra(Constants.USERNAME)

        val totalQuestion = intent.getIntExtra(Constants.totalQuestions, 0)
        val correctAnswers = intent.getIntExtra(Constants.correctAnswers, 0)

        tvScore.text="Your Score is${correctAnswers} Answers out of${totalQuestion}"

        finishButton.setOnClickListener{
            startActivity(Intent(this, MainActivity::class.java))
        }
    }
}