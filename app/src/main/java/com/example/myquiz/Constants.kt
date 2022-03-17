package com.example.myquiz

object Constants {

    const val USER_NAME : String = "user_name"
    const val TOTAL_QUESTIONS: String = "total_questions"
    const val CORRECT_ANSWERS: String = "correct_answers"

    fun getQuestions(): ArrayList<Question>{
        val questionList = ArrayList<Question>()

        val que1 = Question(
            1, "What country does this flag belong to?",
            R.drawable.ic_flag_of_argentina,
            "Argentina", "Australia",
            "Armenia", "Austria",
            1
        )
        questionList.add(que1)

        val que2 = Question(
            1, "What country does this flag belong to?",
            R.drawable.ic_flag_of_australia,
            "Uzbekistan", "Australia",
            "Kazakhstan", "Japan",
            2
        )
        questionList.add(que2)

        val que3 = Question(
            1, "What country does this flag belong to?",
            R.drawable.ic_flag_of_belgium,
            "USA", "South Korea",
            "Armenia", "Belgium",
            4
        )
        questionList.add(que3)

        val que4 = Question(
            1, "What country does this flag belong to?",
            R.drawable.ic_flag_of_brazil,
            "Chad", "Belgium",
            "Argentina", "Brazil",
            4
        )
        questionList.add(que4)

        val que5 = Question(
            1, "What country does this flag belong to?",
            R.drawable.ic_flag_of_denmark,
            "Argentina", "Australia",
            "Denmark", "Austria",
            3
        )
        questionList.add(que5)

        val que6 = Question(
            1, "What country does this flag belong to?",
            R.drawable.ic_flag_of_fiji,
            "Australia", "Brazil",
            "Fiji", "Austria",
            3
        )
        questionList.add(que6)

        val que7 = Question(
            1, "What country does this flag belong to?",
            R.drawable.ic_flag_of_germany,
            "North Korea", "Germany",
            "Kazakhstan", "Uzbekistan",
            2
        )
        questionList.add(que7)

        val que8 = Question(
            1, "What country does this flag belong to?",
            R.drawable.ic_flag_of_india,
            "North Korea", "South Korea",
            "India", "England",
            3
        )
        questionList.add(que8)

        val que9 = Question(
            1, "What country does this flag belong to?",
            R.drawable.ic_flag_of_kuwait,
            "Kuwait", "Iran",
            "Argentina", "Iraq",
            1
        )
        questionList.add(que9)

        val que10 = Question(
            1, "What country does this flag belong to?",
            R.drawable.ic_flag_of_new_zealand,
            "Indonesia", "Australia",
            "Armenia", "New Zealand",
            4
        )
        questionList.add(que10)

        return  questionList
    }
}