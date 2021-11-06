package com.example.quizappv2

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.inputmethod.InputMethodManager
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN

        button_1.setOnClickListener {


            if (edit_text.text.toString().isEmpty()){
                Toast.makeText(this,"Please enter name", Toast.LENGTH_SHORT).show()
                keypad(it)
            }else{
                val intent = Intent(this , QuizQuestionApp::class.java)
                intent.putExtra(Constants.USER_NAME , edit_text.text.toString())
                startActivity(intent)
                finish()

            }
        }

    }
    fun keypad(view: View){
        val imm = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        imm.hideSoftInputFromWindow(view.windowToken , 0)
    }
}