package com.example.mynetflix.api

import com.example.mynetflix.models.detail.ResponseDetail
import com.example.mynetflix.models.home.ResponseGenreList
import com.example.mynetflix.models.home.ResponseMoviesList
import com.example.mynetflix.models.register.BodyRegister
import com.example.mynetflix.models.register.ResponseRegister
import retrofit2.Response
import retrofit2.http.*

interface ApiServices {
    @POST("register")
    suspend fun registerUser(@Body body: BodyRegister): Response<ResponseRegister>

    @GET("genres/{genre_id}/movies")
    suspend fun moviesTopList(@Path("genre_id") id: Int): Response<ResponseMoviesList>

    @GET("genres")
    suspend fun genresList(): Response<ResponseGenreList>

    @GET("movies")
    suspend fun moviesLastList(): Response<ResponseMoviesList>

    @GET("movies")
    suspend fun searchMovie(@Query("q") name: String): Response<ResponseMoviesList>

    @GET("movies/{movie_id}")
    suspend fun detailMovie(@Path("movie_id") id: Int): Response<ResponseDetail>
}