package com.example.panda


data class Friends(val image: Int)

class FriendsList {val list = arrayListOf(
    Friends(R.drawable.avatar),
    Friends(R.drawable.avatar2),
    Friends(R.drawable.avatar3),
    Friends(R.drawable.avatar4),
    Friends(R.drawable.avatar),
    Friends(R.drawable.avatar2),
)}
