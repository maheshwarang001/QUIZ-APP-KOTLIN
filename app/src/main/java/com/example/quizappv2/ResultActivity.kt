package com.example.quizappv2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_result.*

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN

        val username = intent.getStringExtra(Constants.USER_NAME)
        val totalScore = intent.getIntExtra(Constants.CORRECT_ANSWERS , 0)
        val total_question = intent.getIntExtra(Constants.TOTAL_QUESTIONS , 0)

        usename_tv.setText(username)
        scoreBoard_tv.setText("You scored: $totalScore" + "/" + "$total_question")

        end_button.setOnClickListener {
            startActivity(Intent(this , MainActivity::class.java))
            finish()
        }



    }
}