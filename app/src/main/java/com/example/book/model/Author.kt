package com.example.book.model


import com.google.gson.annotations.SerializedName

data class Author(
    @SerializedName("authorFullName")
    val authorFullName: String,
    @SerializedName("authorId")
    val authorId: Int,
    @SerializedName("bookLibraryAuthorId")
    val bookLibraryAuthorId: Int,
    @SerializedName("bookLibraryId")
    val bookLibraryId: Int
)