package com.example.mynetflix.models.register

import com.google.gson.annotations.SerializedName

data class BodyRegister(
    @SerializedName("name")
    var nmae: String = "",
    @SerializedName("email")
    var email: String = "",
    @SerializedName("password")
    var password: String = ""
)
