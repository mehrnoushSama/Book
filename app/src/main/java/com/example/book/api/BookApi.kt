package com.example.book.api

import retrofit2.http.GET

interface BookApi {

    @GET()
    fun getDetails()
}