package com.example.panda

data class Achievements(val image: Int,val text1: String,val text2: String )

class AchievementstList {val list = arrayListOf(
    Achievements(R.drawable.ach1,"Душа компании","Добавь трех друзей"),
    Achievements(R.drawable.ach2,"Воин выходного дня","Вы прошли урок в субботу и воскресенье"),
    Achievements(R.drawable.ach3,"Победитель","Займите первое место в рейтинге"),
    Achievements(R.drawable.ach4,"Эрудит","Изучите 100 новых слов"),
    Achievements(R.drawable.ach1,"Душа компании","Добавь трех друзей"),

)}
