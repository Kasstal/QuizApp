package com.example.myquizapp

object Constants {
    const val USER_NAME : String = "user_name"
    const val TOTAL_QUESTIONS = "total_questions"
    const val CORRECT_ANSWERS = "correct_answers"

    fun getQuestions():ArrayList<Question>{
        val questionsList=ArrayList<Question>()

        val q1 = Question(
            1, "Who is this guy?",
            R.drawable.saul_goodman,
            "John Week", "Shrek",
            "Deez nuts", "Freddy",
            1
        )
        questionsList.add(q1)

        val q2 = Question(
            2, "What country does this flag belong to?",
            R.drawable.ic_flag_of_argentina,
            "Argentina", "Kazakhstan",
            "Denmark", "Kuwait",
            1
        )
        questionsList.add(q2)

        val q3 = Question(
            3, "What country does this flag belong to?",
            R.drawable.ic_flag_of_australia,
            "New Zealand", "Kazakhstan",
            "England", "Australia",
            4
        )
        questionsList.add(q3)

        val q4 = Question(
            4, "What country does this flag belong to?",
            R.drawable.ic_flag_of_belgium,
            "Germany", "Belgium",
            "Italy", "Somalia",
            2
        )
        questionsList.add(q4)

        val q5 = Question(
            5, "What country does this flag belong to?",
            R.drawable.ic_flag_of_brazil,
            "Brazil", "Slovakia",
            "Spain", "Mexico",
            1
        )
        questionsList.add(q5)

        val q6 = Question(
            6, "What country does this flag belong to?",
            R.drawable.ic_flag_of_denmark,
            "Sweden", "Switzerland",
            "Denmark", "Belgium",
            3
        )
        questionsList.add(q6)

        val q7 = Question(
            7, "What country does this flag belong to?",
            R.drawable.ic_flag_of_fiji,
            "England", "Kazakhstan",
            "Kyrgyzstan", "Fiji",
            4
        )
        questionsList.add(q7)

        val q8 = Question(
            8, "What country does this flag belong to?",
            R.drawable.ic_flag_of_germany,
            "China", "Russia",
            "Germany", "Hungary",
            3
        )
        questionsList.add(q8)

        val q9 = Question(
            9, "What country does this flag belong to?",
            R.drawable.ic_flag_of_india,
            "Belgium", "Hawaii",
            "Sweden", "India",
            4
        )
        questionsList.add(q9)

        val q10 = Question(
            10, "What country does this flag belong to?",
            R.drawable.ic_flag_of_kuwait,
            "Kuwait", "Whatever",
            "Frusciante", "Jemappelle",
            1
        )
        questionsList.add(q10)

        val q11 = Question(
            11, "What country does this flag belong to?",
            R.drawable.ic_flag_of_new_zealand,
            "Australia", "Australia",
            "New Zealand", "Australia",
            3
        )
        questionsList.add(q11)
        return questionsList
    }
}