package com.example.myquiz

object Constants {

    fun getQuestions(): ArrayList<Question>{
        val questionList = ArrayList<Question>()

        val que1 = Question(
            1, "What country does this flag belong to?",
            R.drawable.ic_flag_of_argentina,
            "Argentina", "Aurstralia",
            "Armenia", "Austria",
            1
        )
        questionList.add(que1)

        return  questionList
    }
}