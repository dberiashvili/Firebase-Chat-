package com.example.chatapp.ui.authentication.models

class User(
    val userName: String,
    val uid: String,
    val toUID: String,
    var url: String = "https://img1.looper.com/img/gallery/we-now-know-the-one-time-batman-was-supposed-to-die/intro-1576009072.jpg",
    val message: String,
    val timeStamp:Long
){
    constructor():this("", "", "", "", "", 0)
}
