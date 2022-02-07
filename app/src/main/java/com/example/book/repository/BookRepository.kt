package com.example.book.repository

import com.example.book.api.BookApi
import com.example.book.model.BookDetail
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import javax.inject.Inject
import javax.inject.Singleton


@Singleton
class BookRepository @Inject constructor(var bookApi: BookApi) {

    fun getBookDetail(completion: (BookDetail?) -> Unit) {
        bookApi.getDetails(84).enqueue(object : Callback<BookDetail> {
            override fun onResponse(call: Call<BookDetail>, response: Response<BookDetail>) {
                completion(response.body())
            }

            override fun onFailure(call: Call<BookDetail>, t: Throwable) {
                completion(null)
            }

        })

    }
}