package com.example.quizapp

object Constants {

    const val USERNAME : String = "user_name"
    const val totalQuestions : String = "total_questions"
    const val correctAnswers : String = "correct_answers"

    fun getQuestions():ArrayList<Question>{
        val questionList = ArrayList<Question>()

        val que1 = Question(
            1,
            "Although normally referred to as Jordan, the full name of the country is The Hashemite Kingdom of Jordan, but what does Hashemite refer to?",
            R.drawable.flagofjordan,
            "an Arabic term for Paradise",
            "the mountainous central region of the country",
            "an early ancestor of the ruling family",
            "the desert area which covers nearly 90% of the country",
            3
        )
        questionList.add(que1)

        val que2 = Question(
            2,
            "Which of these countries does not have a border with Jordan?",
            R.drawable.mapofjordan,
            "Palestine",
            "Iraq",
            "Lebanon",
            "Syria",
            3
        )
        questionList.add(que2)

        val que3 = Question(
            3,
            "What was Jordan called, immediately prior to the establishment of the present day Hashemite Kingdom of Jordan?",
            R.drawable.oldimageofjordan,
            "Transjordan",
            "Levant",
            "Arabia",
            "Mesopotamia",
            1
        )
        questionList.add(que3)

        val que4 = Question(
            4,
            "What was the nickname of the British colonel, who during World War I, led daring raids on Turkish forces in Jordan?",
            R.drawable.flagofbritian,
            "Lawrence of Arabia",
            "The Red Shadow",
            "The Desert Fox",
            "Monty of El-Alamein",
            1
        )
        questionList.add(que4)

        val que5 = Question(
            5,
            "Perhaps the most famous of Jordan's many historic sites and monuments is the Nabatean city of Petra. By what other name is Petra commonly known?",
            R.drawable.petra,
            "The Rock City",
            "The Rose City",
            "The River City",
            "The Sand City",
            2
        )
        questionList.add(que5)

        val que6 = Question(
            6,
            "The Dead Sea is situated on the border between Jordan and Israel. Why is this sea called the Dead Sea?",
            R.drawable.petra,
            "No major life forms can survive in it.",
            "In ancient times it was the scene of several major battles, in which many thousands died.",
            "There were several major cities on its shores, which are now just ruins.",
            "Dead is simply a derivation of the Arabic word meaning salt.",
            1
        )
        questionList.add(que6)

        val que7 = Question(
            7,
            "The River Jordan is Jordan's main source of fresh water, but where does this river end up?",
            R.drawable.mapofjordan,
            "The Dead Sea",
            "The Mediterranean Sea",
            "The Red Sea",
            "The Sea of Galilee",
            3
        )
        questionList.add(que7)

        val que8 = Question(
            8,
            "The Bible records that Jesus was baptized in the River Jordan by Who?",
            R.drawable.pictureofjesus,
            "Marry",
            "John the Baptist",
            "Edmund Campion",
            "Juan de Castillo",
            2
        )
        questionList.add(que8)

        val que9 = Question(
            9,
            "On the national flag of Jordan there is a seven point star. What do these seven points signify?",
            R.drawable.flagofjordan,
            "the seven states comprising the kingdom of Jordan",
            "the seven pillars of wisdom",
            "the first seven verses of the Koran",
            "the seven loops of the Jordan river",
            3
        )
        questionList.add(que9)

        val que10 = Question(
            10,
            "What is the capital city of Jordan?",
            R.drawable.mapofjordan,
            "Damascus",
            "Oman",
            "Amman",
            "Beirut",
            3
        )
        questionList.add(que10)

        return questionList
    }
}