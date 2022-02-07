package com.example.book.ui.bookDetail

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.book.model.BookDetail
import com.example.book.repository.BookRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject


@HiltViewModel
class BookDetailViewModel @Inject constructor(private val repository: BookRepository) :
    ViewModel() {

    val bookDetail: MutableLiveData<BookDetail> = MutableLiveData()

    fun getBookDetail() {
        return repository.getBookDetail() {

            bookDetail.value = it
        }

    }


}