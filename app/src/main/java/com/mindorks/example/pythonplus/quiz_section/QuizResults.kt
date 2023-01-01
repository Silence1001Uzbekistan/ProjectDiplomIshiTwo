package com.mindorks.example.pythonplus.quiz_section

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.AppCompatButton
import android.widget.TextView
import android.content.Intent
import androidx.core.content.ContextCompat
import uz.widvan.example.pythonplus.R

class QuizResults : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz_results)

        window.setStatusBarColor(ContextCompat.getColor(this, R.color.black))

        val startNewBtn = findViewById<AppCompatButton>(R.id.startNewQuizBtn)
        val correctAnswer = findViewById<TextView>(R.id.correctAnswers)
        val incorrectAnswer = findViewById<TextView>(R.id.incorrectAnswers)
        val getCorrectAnswers = intent.getIntExtra("correct", 0)
        val getInCorrectAnswers = intent.getIntExtra("incorrect", 0)
        correctAnswer.text = getCorrectAnswers.toString()
        incorrectAnswer.text = getInCorrectAnswers.toString()
        startNewBtn.setOnClickListener {
            startActivity(Intent(this@QuizResults, QuizMainActivity::class.java))
            finish()
        }
    }

    @Deprecated("Deprecated in Java")
    override fun onBackPressed() {
        startActivity(Intent(this@QuizResults, QuizMainActivity::class.java))
        finish()
    }
}