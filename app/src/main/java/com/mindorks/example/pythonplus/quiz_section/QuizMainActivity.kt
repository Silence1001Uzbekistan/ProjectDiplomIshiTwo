package com.mindorks.example.pythonplus.quiz_section

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.RelativeLayout
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import uz.widvan.example.pythonplus.R

class QuizMainActivity : AppCompatActivity() {
    private var selectedTopicName = ""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_quiz)

        window.statusBarColor = ContextCompat.getColor(this, R.color.main_quiz_color)

        val py1 = findViewById<RelativeLayout>(R.id.python1Layout)
        val py2 = findViewById<RelativeLayout>(R.id.python2Layout)
        val py3 = findViewById<RelativeLayout>(R.id.python3Layout)
        val py4 = findViewById<RelativeLayout>(R.id.python4Layout)
        val py5 = findViewById<RelativeLayout>(R.id.python5Layout)
        val py6 = findViewById<RelativeLayout>(R.id.python6Layout)
        val startBtn = findViewById<Button>(R.id.startQuizBtn)

        py1.setOnClickListener {
            selectedTopicName = "Python dasturlash tili"
            py1.setBackgroundResource(R.drawable.round_back_white_stroke10)
            py2.setBackgroundResource(R.drawable.round_back_white10)
            py3.setBackgroundResource(R.drawable.round_back_white10)
            py4.setBackgroundResource(R.drawable.round_back_white10)
            py5.setBackgroundResource(R.drawable.round_back_white10)
            py6.setBackgroundResource(R.drawable.round_back_white10)
        }
        py2.setOnClickListener {
            selectedTopicName = "Pythonda ma’lumot turlari"
            py2.setBackgroundResource(R.drawable.round_back_white_stroke10)
            py1.setBackgroundResource(R.drawable.round_back_white10)
            py3.setBackgroundResource(R.drawable.round_back_white10)
            py4.setBackgroundResource(R.drawable.round_back_white10)
            py5.setBackgroundResource(R.drawable.round_back_white10)
            py6.setBackgroundResource(R.drawable.round_back_white10)
        }
        py3.setOnClickListener {
            selectedTopicName = "Python statements"
            py3.setBackgroundResource(R.drawable.round_back_white_stroke10)
            py1.setBackgroundResource(R.drawable.round_back_white10)
            py2.setBackgroundResource(R.drawable.round_back_white10)
            py4.setBackgroundResource(R.drawable.round_back_white10)
            py5.setBackgroundResource(R.drawable.round_back_white10)
            py6.setBackgroundResource(R.drawable.round_back_white10)
        }
        py4.setOnClickListener {
            selectedTopicName = "Funksiya va modullar"
            py4.setBackgroundResource(R.drawable.round_back_white_stroke10)
            py1.setBackgroundResource(R.drawable.round_back_white10)
            py2.setBackgroundResource(R.drawable.round_back_white10)
            py3.setBackgroundResource(R.drawable.round_back_white10)
            py5.setBackgroundResource(R.drawable.round_back_white10)
            py6.setBackgroundResource(R.drawable.round_back_white10)
        }
        py5.setOnClickListener {
            selectedTopicName = "Fayllar va istisnolar"
            py5.setBackgroundResource(R.drawable.round_back_white_stroke10)
            py1.setBackgroundResource(R.drawable.round_back_white10)
            py2.setBackgroundResource(R.drawable.round_back_white10)
            py3.setBackgroundResource(R.drawable.round_back_white10)
            py4.setBackgroundResource(R.drawable.round_back_white10)
            py6.setBackgroundResource(R.drawable.round_back_white10)
        }
        py6.setOnClickListener {
            selectedTopicName = "Pythonda OOP"
            py6.setBackgroundResource(R.drawable.round_back_white_stroke10)
            py1.setBackgroundResource(R.drawable.round_back_white10)
            py2.setBackgroundResource(R.drawable.round_back_white10)
            py3.setBackgroundResource(R.drawable.round_back_white10)
            py4.setBackgroundResource(R.drawable.round_back_white10)
            py5.setBackgroundResource(R.drawable.round_back_white10)
        }
        startBtn.setOnClickListener {
            if (selectedTopicName.isEmpty()) {
                Toast.makeText(this@QuizMainActivity, "Iltimos kerakli bo'limni tanlang!", Toast.LENGTH_LONG)
                    .show()
            } else {
                val intent = Intent(this@QuizMainActivity, QuizActivity::class.java)
                intent.putExtra("selectedTopic", selectedTopicName)
                startActivity(intent)
            }
        }
    }
}