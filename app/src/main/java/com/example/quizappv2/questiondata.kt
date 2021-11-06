package com.example.quizappv2

import androidx.annotation.StringRes

data class Question(
    val id: Int ,
    val question: String,
    val image: Int,
    val opt1: String,
    val opt2: String,
    val opt3: String,
    val correctAnswer: Int
){
}