package com.example.book.api

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object ApiClient {

    private val Base_URL = ""
    fun getInstance(): BookApi {

        val retrofit = Retrofit.Builder()
            .addConverterFactory(GsonConverterFactory.create())
            .baseUrl(Base_URL)
            .build()

        return retrofit.create(BookApi::class.java)

    }

}