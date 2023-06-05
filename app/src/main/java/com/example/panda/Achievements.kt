package com.example.panda

data class Achievements(val image: Int,val text1: String,val text2: String )

class AchievementstList {val list = arrayListOf(
    Achievements(R.drawable.tab,"Душа компании","Подпишись на трех друзей"),
    Achievements(R.drawable.tab,"Воин выходного дня","Вы прошли урок в субботу и воскресенье"),
    Achievements(R.drawable.tab,"Победитель","Займите первое место в рейтинге"),
    Achievements(R.drawable.tab,"Эрудит","Изучите 100 новых слов"),
    Achievements(R.drawable.tab,"Душа компании","Подпишись на трех друзей"),

)}
