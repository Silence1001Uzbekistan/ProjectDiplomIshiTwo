package com.mindorks.example.pythonplus.quiz_section

object QuestionsBank {

    private fun python1_Questions(): List<QuestionsList> {
        val questionsLists: MutableList<QuestionsList> = ArrayList()

        //Create object of QuestionsList class and pass a questions along with options and answer
        val question1 = QuestionsList(
            "Python kim tomonidan yaratilgan?",
            "Guido van Rossum ",
            "Tim Breness-Lii",
            "Rasmus Lerdof",
            "Brendan Eyx",
            "Guido van Rossum ",
            ""
        )
        val question2 = QuestionsList(
            "Python dasturlash tili nechanchi yil yaratilgan?",
            "1992-yil",
            "1991-yil",
            "1990-yil",
            "1993-yil",
            "1991-yil",
            ""
        )
        val question3 = QuestionsList(
            "Python qasyi sohalarda ishlatiladi?",
            "Web dasturlash (serverlar bilan",
            "Dasturiy ta’minot",
            "Tizim skriptlari",
            "Barcha javob to'g'ri",
            "Barcha javob to'g'ri",
            ""
        )
        val question4 = QuestionsList(
            "Izoh qoldirish qaysi belgi yordamida bajariladi?",
            "//",
            "*",
            "#",
            "$",
            "#",
            ""
        )
        val question5 = QuestionsList(
            "Pythonda o'zgaruvchilar tiplari e'lon qiinadimi?",
            "Ha",
            "Yo'q",
            "Bilmayman",
            "Mumkin",
            "Yo'q",
            ""
        )
        val question6 = QuestionsList(
            "O'zaruvchi nomlari qanday yozilishi kerak?",
            "O’zgaruvchi nomi raqam bilan boshlanishi kerak",
            "	O’zgaruvchi nomlari katta-kichik harflarni farqlamaydi ",
            "O’zgaruvchi nomi orasida bo’shliq (probel) bo’lishi kerak",
            "	O’zgaruvchi nomi faqat harflar, raqamlar va tag chiziqdan iborat bo’lishi mumkin",
            "O’zgaruvchi nomi faqat harflar, raqamlar va tag chiziqdan iborat bo’lishi mumkin",
            ""
        )

        //add all questions to List<QuestionsList>
        questionsLists.add(question1)
        questionsLists.add(question2)
        questionsLists.add(question3)
        questionsLists.add(question4)
        questionsLists.add(question5)
        questionsLists.add(question6)
        return questionsLists
    }

    private fun python2_Questions(): List<QuestionsList> {
        val questionsLists: MutableList<QuestionsList> = ArrayList()

        //Create object of QuestionsList class and pass a questions along with options and answer
        val question1 = QuestionsList(
            "%- ?",
            "Qoldiqli bo'lish",
            "Inkor",
            "Bo'lish",
            "Ko'paytirish",
            "Qoldiqli bo'lish",
            ""
        )
        val question2 = QuestionsList(
            "and operatorining vazifasi qanday ?",
            "Agar ikkala shart ham rost bo’lsa, rost qiymat qaytaradi.",
            "Kamida bitta shart rost bo’lsa ham rost qiymat qaytaradi",
            "Shart qiymatini teskarisiga o’zgartiradi, ya’ni rost bo’lsa yolg’on, yolg’on bo’lsa rost bo’ladi",
            "To'g'ri javob yo'q",
            "Agar ikkala shart ham rost bo’lsa, rost qiymat qaytaradi.",
            ""
        )
        val question3 = QuestionsList(
            "	is aniqlash operatorining vazifasi qanday?",
            "Obyektlar bir xil bo’lmasa rost, aks holda yolg’on qiymat qaytaradi",
            "Ikkala o’zgaruvchi ham bir xil obyekt bo’lsa rost, aks holda yolg’on qiymat qaytaradi",
            "Agar ikkala shart ham rost bo’lsa, rost qiymat qaytaradi.",
            "Kamida bitta shart rost bo’lsa ham rost qiymat qaytaradi",
            "Ikkala o’zgaruvchi ham bir xil obyekt bo’lsa rost, aks holda yolg’on qiymat qaytaradi",
            ""
        )
        val question4 = QuestionsList(
            "is not aniqlash operatorining vazifasi qanday?",
            "Obyektlar bir xil bo’lmasa rost, aks holda yolg’on qiymat qaytaradi",
            "Ikkala o’zgaruvchi ham bir xil obyekt bo’lsa rost, aks holda yolg’on qiymat qaytaradi",
            "Agar ikkala shart ham rost bo’lsa, rost qiymat qaytaradi.",
            "Kamida bitta shart rost bo’lsa ham rost qiymat qaytaradi",
            "Obyektlar bir xil bo’lmasa rost, aks holda yolg’on qiymat qaytaradi",
            ""
        )
        val question5 = QuestionsList(
            "in qanday operator turi?",
            "A'zolik operatori",
            "Aniqlash operatori",
            "Mantiqiy operatori",
            "Bitli operator",
            "A'zolik operatori",
            ""
        )

        //add all questions to List<QuestionsList>
        questionsLists.add(question1)
        questionsLists.add(question2)
        questionsLists.add(question3)
        questionsLists.add(question4)
        questionsLists.add(question5)
        return questionsLists
    }

    private fun python3_Questions(): List<QuestionsList> {
        val questionsLists: MutableList<QuestionsList> = ArrayList()

        //Create object of QuestionsList class and pass a questions along with options and answer
        val question1 = QuestionsList(
            "is operatori qanday operator?",
            "A'zolik operatori",
            "Aniqlash operatori",
            "Mantiqiy operatori",
            "Bitli operator",
            "Aniqlash operatori",
            ""
        )
        val question2 = QuestionsList(
            "is  not operatori qanday operator?",
            "A'zolik operatori",
            "Aniqlash operatori",
            "Mantiqiy operatori",
            "Bitli operator",
            "Aniqlash operatori",
            ""
        )
        val question3 = QuestionsList(
            "and operatori qanday operator?",
            "A'zolik operatori",
            "Aniqlash operatori",
            "Mantiqiy operatori",
            "Bitli operator",
            "Mantiq operatori",
            ""
        )
        val question4 = QuestionsList(
            "or operatori qanday operator?",
            "A'zolik operatori",
            "Aniqlash operatori",
            "Mantiqiy operatori",
            "Bitli operator",
            "Mantiq operatori",
            ""
        )
        val question5 = QuestionsList(
            "not operatori qanday operator?",
            "A'zolik operatori",
            "Aniqlash operatori",
            "Mantiqiy operatori",
            "Bitli operator",
            "Mantiq operatori",
            ""
        )
        val question6 = QuestionsList(
            "not in  operatori qanday operator?",
            "A'zolik operatori",
            "Aniqlash operatori",
            "Mantiqiy operatori",
            "Bitli operator",
            "A'zolik operatori",
            ""
        )

        //add all questions to List<QuestionsList>
        questionsLists.add(question1)
        questionsLists.add(question2)
        questionsLists.add(question3)
        questionsLists.add(question4)
        questionsLists.add(question5)
        questionsLists.add(question6)
        return questionsLists
    }

    private fun python4_Questions(): List<QuestionsList> {
        val questionsLists: MutableList<QuestionsList> = ArrayList()

        //Create object of QuestionsList class and pass a questions along with options and answer
        val question1 = QuestionsList(
            "Python kim tomonidan yaratilgan?",
            "Guido van Rossum ",
            "Tim Breness-Lii",
            "Rasmus Lerdof",
            "Brendan Eyx",
            "Guido van Rossum ",
            ""
        )
        val question2 = QuestionsList(
            "Python dasturlash tili nechanchi yil yaratilgan?",
            "1992-yil",
            "1991-yil",
            "1990-yil",
            "1993-yil",
            "1991-yil",
            ""
        )
        val question3 = QuestionsList(
            "Python qasyi sohalarda ishlatiladi?",
            "Web dasturlash (serverlar bilan",
            "Dasturiy ta’minot",
            "Tizim skriptlari",
            "Barcha javob to'g'ri",
            "Barcha javob to'g'ri",
            ""
        )
        val question4 = QuestionsList(
            "Izoh qoldirish qaysi belgi yordamida bajariladi?",
            "//",
            "*",
            "#",
            "$",
            "#",
            ""
        )
        val question5 = QuestionsList(
            "Pythonda o'zgaruvchilar tiplari e'lon qiinadimi?",
            "Ha",
            "Yo'q",
            "Bilmayman",
            "Mumkin",
            "Yo'q",
            ""
        )
        val question6 = QuestionsList(
            "O'zaruvchi nomlari qanday yozilishi kerak?",
            "O’zgaruvchi nomi raqam bilan boshlanishi kerak",
            "	O’zgaruvchi nomlari katta-kichik harflarni farqlamaydi ",
            "O’zgaruvchi nomi orasida bo’shliq (probel) bo’lishi kerak",
            "	O’zgaruvchi nomi faqat harflar, raqamlar va tag chiziqdan iborat bo’lishi mumkin",
            "O’zgaruvchi nomi faqat harflar, raqamlar va tag chiziqdan iborat bo’lishi mumkin",
            ""
        )

        //add all questions to List<QuestionsList>
        questionsLists.add(question1)
        questionsLists.add(question2)
        questionsLists.add(question3)
        questionsLists.add(question4)
        questionsLists.add(question5)
        questionsLists.add(question6)
        return questionsLists
    }


    private fun python5_Questions(): List<QuestionsList> {
        val questionsLists: MutableList<QuestionsList> = ArrayList()

        //Create object of QuestionsList class and pass a questions along with options and answer
        val question1 = QuestionsList(
            "%- ?",
            "Qoldiqli bo'lish",
            "Inkor",
            "Bo'lish",
            "Ko'paytirish",
            "Qoldiqli bo'lish",
            ""
        )
        val question2 = QuestionsList(
            "and operatorining vazifasi qanday ?",
            "Agar ikkala shart ham rost bo’lsa, rost qiymat qaytaradi.",
            "Kamida bitta shart rost bo’lsa ham rost qiymat qaytaradi",
            "Shart qiymatini teskarisiga o’zgartiradi, ya’ni rost bo’lsa yolg’on, yolg’on bo’lsa rost bo’ladi",
            "To'g'ri javob yo'q",
            "Agar ikkala shart ham rost bo’lsa, rost qiymat qaytaradi.",
            ""
        )
        val question3 = QuestionsList(
            "	is aniqlash operatorining vazifasi qanday?",
            "Obyektlar bir xil bo’lmasa rost, aks holda yolg’on qiymat qaytaradi",
            "Ikkala o’zgaruvchi ham bir xil obyekt bo’lsa rost, aks holda yolg’on qiymat qaytaradi",
            "Agar ikkala shart ham rost bo’lsa, rost qiymat qaytaradi.",
            "Kamida bitta shart rost bo’lsa ham rost qiymat qaytaradi",
            "Ikkala o’zgaruvchi ham bir xil obyekt bo’lsa rost, aks holda yolg’on qiymat qaytaradi",
            ""
        )
        val question4 = QuestionsList(
            "is not aniqlash operatorining vazifasi qanday?",
            "Obyektlar bir xil bo’lmasa rost, aks holda yolg’on qiymat qaytaradi",
            "Ikkala o’zgaruvchi ham bir xil obyekt bo’lsa rost, aks holda yolg’on qiymat qaytaradi",
            "Agar ikkala shart ham rost bo’lsa, rost qiymat qaytaradi.",
            "Kamida bitta shart rost bo’lsa ham rost qiymat qaytaradi",
            "Obyektlar bir xil bo’lmasa rost, aks holda yolg’on qiymat qaytaradi",
            ""
        )
        val question5 = QuestionsList(
            "in qanday operator turi?",
            "A'zolik operatori",
            "Aniqlash operatori",
            "Mantiqiy operatori",
            "Bitli operator",
            "A'zolik operatori",
            ""
        )

        //add all questions to List<QuestionsList>
        questionsLists.add(question1)
        questionsLists.add(question2)
        questionsLists.add(question3)
        questionsLists.add(question4)
        questionsLists.add(question5)
        return questionsLists
    }

    private fun python6_Questions(): List<QuestionsList> {
        val questionsLists: MutableList<QuestionsList> = ArrayList()

        //Create object of QuestionsList class and pass a questions along with options and answer
        val question1 = QuestionsList(
            "is operatori qanday operator?",
            "A'zolik operatori",
            "Aniqlash operatori",
            "Mantiqiy operatori",
            "Bitli operator",
            "Aniqlash operatori",
            ""
        )
        val question2 = QuestionsList(
            "is  not operatori qanday operator?",
            "A'zolik operatori",
            "Aniqlash operatori",
            "Mantiqiy operatori",
            "Bitli operator",
            "Aniqlash operatori",
            ""
        )
        val question3 = QuestionsList(
            "and operatori qanday operator?",
            "A'zolik operatori",
            "Aniqlash operatori",
            "Mantiqiy operatori",
            "Bitli operator",
            "Mantiq operatori",
            ""
        )
        val question4 = QuestionsList(
            "or operatori qanday operator?",
            "A'zolik operatori",
            "Aniqlash operatori",
            "Mantiqiy operatori",
            "Bitli operator",
            "Mantiq operatori",
            ""
        )
        val question5 = QuestionsList(
            "not operatori qanday operator?",
            "A'zolik operatori",
            "Aniqlash operatori",
            "Mantiqiy operatori",
            "Bitli operator",
            "Mantiq operatori",
            ""
        )
        val question6 = QuestionsList(
            "not in  operatori qanday operator?",
            "A'zolik operatori",
            "Aniqlash operatori",
            "Mantiqiy operatori",
            "Bitli operator",
            "A'zolik operatori",
            ""
        )

        //add all questions to List<QuestionsList>
        questionsLists.add(question1)
        questionsLists.add(question2)
        questionsLists.add(question3)
        questionsLists.add(question4)
        questionsLists.add(question5)
        questionsLists.add(question6)
        return questionsLists
    }

    @JvmStatic
    fun getQuestions(selectedTopicName: String?): List<QuestionsList> {
        return when (selectedTopicName) {
            "2-qism" -> python2_Questions()
            "3-qism" -> python3_Questions()
            "4-qism" -> python4_Questions()
            "5-qism" -> python5_Questions()
            "6-qism" -> python6_Questions()
            else -> python1_Questions()
        }
    }
}