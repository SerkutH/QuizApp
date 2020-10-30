package com.serkut.quizapp

object Constants {
    const val USER_NAME: String = "user_name"
    const val TOTAL_QUESTIONS = "total questions"
    const val CORRECT_ANSWERS = "correct answers"
        fun getQuestions() : ArrayList<Question> {
        val questionsList = ArrayList<Question>()

            //1
            val que1 = Question(1,"How many Champions League trophies Cristiano Ronaldo has won",R.drawable.cr7,"1",
            "2",
            "3",
            "4",
            4)
            questionsList.add(que1)

            //2
            val que2 = Question(2,"How much does Lionel Messi worth according to TransferMarkt",R.drawable.messi,"80",
                "100",
                "120",
                "140",
                2)
            questionsList.add(que2)

            //3
            val que3 = Question(3,"What is year of the birth of Erling Haaland",R.drawable.haaland,"1999",
                "2000",
                "2001",
                "2002",
                2)
            questionsList.add(que3)

            //4
            val que4 = Question(4,"Who is the most valuable player in the Champions League",R.drawable.cl,"Mohammed Salah",
                "Kylian Mbappe",
                "Neymar",
                "Raheem Sterling",
                2)
            questionsList.add(que2)

            // 5
            val que5 = Question(5,"Which of the following has not involved to the Premier League this year",R.drawable.pl,"Fulham FC",
                "Leeds United",
                "West Ham United",
                "West Bromwich Albion",
                3)
            questionsList.add(que5)

            //6
            val que6 = Question(6,"Who won the championship in Turkish Super League(2019/2020)",R.drawable.sl,"Fenerbahçe",
                "Galatasaray",
                "Beşiktaş",
                "Başakşehir",
                4)
            questionsList.add(que6)

            //7
            val que7 = Question(7,"Which country won the first World Cup in 1930?",R.drawable.world,"Uruguay",
                "Brazil",
                "England",
                "Germany",
                1)
            questionsList.add(que7)

            //8
            val que8 = Question(8,"Which club has the highest average number of fans per game in Europe?\n",R.drawable.fan," BVB Dortmund",
                "Barselona",
                "Manchester United",
                "Roma",
                1)
            questionsList.add(que8)

            //9
            val que9 = Question(9,"Which year was the unforgettable Liverpool-Milan Champions League final hosted by Istanbul?",R.drawable.ist,"2004",
                "2006",
                "2007",
                "2005",
                4)
            questionsList.add(que9)

            //10
            val que10 = Question(10,"Which country earned the most Copa America?",R.drawable.copa,"Uruguay",
                "Brazil",
                "Argentina",
                "Chile",
                1)
            questionsList.add(que10)

            //11
            val que11 = Question(11,"Who is the football player with the most goals in World Cup history?",R.drawable.world2,"Ronaldo Nazario",
                "Maradona",
                "Pele",
                "Miroslav Klose",
                4)
            questionsList.add(que11)

            //12
            val que12 = Question(1,"The only player to win the Champions League with three different clubs",R.drawable.cl2,"Clarence Seedorf",
                "Cristiano Ronaldo",
                "Johan Cruyff",
                "Ronaldinho",
                1)
            questionsList.add(que12)

            //13
            val que13 = Question(1,"Which manager famously gave his players 'the Hairdryer Treatment'?",R.drawable.hairdryer,"Mourinho",
                "Arsen Wenger",
                "Robert Mancini",
                "Sir Alex Ferguson",
                4)
            questionsList.add(que13)

            //14
            val que14 = Question(1,"English rock star Elton John was twice the owner of which football club?",R.drawable.elton,"Burnley",
                "Watford",
                "Leeds",
                "Everton",
                2)
            questionsList.add(que14)

            //15
            val que15 = Question(1,"How many teams are started to play 2020/2021 Champions League",R.drawable.cl3,"32",
                "23",
                "24",
                "42",
                2)
            questionsList.add(que15)

            //16
            val que16 = Question(1,"Which player scored the fastest hat-trick in the Premier League?",R.drawable.pl3,"Didier Drogba",
                "Mohammed Salah",
                "Sadio Mane",
                "Ibrahimovic",
                3)
            questionsList.add(que16)

            //17
            val que17 = Question(1,"Which of the following teams Ibrahimovic was not played",R.drawable.ibra,"Inter",
                "Real Madrid",
                "Milan",
                "L.A Galaxy",
                2)
            questionsList.add(que17)

            //18
            val que18 = Question(1,"Which country has appeared in three World Cup finals, but never won the competition?",R.drawable.world2,"Netherlands",
                "Portugal",
                "Turkey",
                "Colombia",
                1)
            questionsList.add(que18)

            //19
            val que19 = Question(1,"Which team plays their football at Estadio da Luz?",R.drawable.de,"Lazio",
                "Sevilla",
                "Boca Juniors",
                "Benfica",
                4)
            questionsList.add(que19)

            //20
            val que20 = Question(1,"How many clubs did David Beckham play for during his career",R.drawable.beckham,"4",
                "5",
                "6",
                "7",
                3)
            questionsList.add(que20)

            return questionsList

    }
}