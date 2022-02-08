package com.example.book.repository

import com.example.book.api.BookApi
import com.example.book.model.BookInfoResult
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import javax.inject.Inject
import javax.inject.Singleton


@Singleton
class BookRepository @Inject constructor(var bookApi: BookApi) {

    fun getBookDetail(completion: (BookInfoResult?) -> Unit) {
        bookApi.getDetails(84).enqueue(object : Callback<BookInfoResult> {
            override fun onResponse(
                call: Call<BookInfoResult>,
                response: Response<BookInfoResult>
            ) {
                completion(response.body())
            }

            override fun onFailure(call: Call<BookInfoResult>, t: Throwable) {
                completion(null)
            }

        })

    }
}