package com.example.mynetflix.repository

import com.example.mynetflix.api.ApiServices
import com.example.mynetflix.models.register.BodyRegister
import javax.inject.Inject

class RegisterRepository @Inject constructor(private val api: ApiServices) {

    suspend fun registerUser(body: BodyRegister) = api.registerUser(body)
}