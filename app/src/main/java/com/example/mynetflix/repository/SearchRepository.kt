package com.example.mynetflix.repository

import com.example.mynetflix.api.ApiServices
import javax.inject.Inject

class SearchRepository @Inject constructor(private val api: ApiServices) {
    suspend fun searchMovie(name: String) = api.searchMovie(name)
}