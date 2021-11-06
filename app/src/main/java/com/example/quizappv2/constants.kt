package com.example.quizappv2

object Constants{

    const val USER_NAME: String = "user_name"
    const val TOTAL_QUESTIONS: String = "total_questions"
    const val CORRECT_ANSWERS: String = "correct_answers"

    fun getQUestions (): ArrayList<Question>{

        var questionList = ArrayList<Question>()

        val que1 = Question(1 ,
            "What country does this flag belongs to?",
            R.drawable.canada,
            "Canada" ,
            "Pakistan" ,
            "USA" ,
            1)

        questionList.add(que1)

        val que2 = Question(1 ,
            "What country does this flag belongs to?",
            R.drawable.germany_flag,
            "China" ,
            "Norway" ,
            "Germany" ,
            3)

        questionList.add(que2)

        val que3 = Question(1 ,
            "What country does this flag belongs to?",
            R.drawable.el_salvador_flag,
            "Norway" ,
            "Poland" ,
            "El Salvador" ,
            3)

        questionList.add(que3)


        return  questionList
    }
}