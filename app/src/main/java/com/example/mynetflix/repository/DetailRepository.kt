package com.example.mynetflix.repository

import com.example.mynetflix.api.ApiServices
import com.example.mynetflix.db.MovieEntity
import com.example.mynetflix.db.MoviesDao
import javax.inject.Inject

class DetailRepository @Inject constructor(
    private val api: ApiServices,
    private val dao: MoviesDao
) {
    // Api
    suspend fun detailMovie(id: Int) = api.detailMovie(id)

    // Database
    suspend fun insertMovie(entity: MovieEntity) = dao.insertMovie(entity)
    suspend fun deleteMovie(entity: MovieEntity) = dao.deleteMovie(entity)
    suspend fun existMovie(id: Int) = dao.existsMovie(id)
}