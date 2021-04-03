package com.example.twokotlin

import java.io.Serializable

data class User(
    var firstName: String = "",
    var secondName: String = "",
    var email: String = "",
    var address: String = ""
) : Serializable