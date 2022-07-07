package com.example.mynetflix.models.home

import com.google.gson.annotations.SerializedName

class ResponseGenreList : ArrayList<ResponseGenreList.ResponseGenreListItem>() {
    data class ResponseGenreListItem(
        @SerializedName("id")
        val id: Int?, // 21
        @SerializedName("name")
        val name: String? // Sport
    )
}