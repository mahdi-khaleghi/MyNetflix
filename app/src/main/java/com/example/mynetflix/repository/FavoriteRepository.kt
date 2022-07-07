package com.example.mynetflix.repository

import com.example.mynetflix.db.MoviesDao
import javax.inject.Inject

class FavoriteRepository @Inject constructor(private val dao: MoviesDao) {
    fun allFavoriteList() = dao.getAllMovies()
}