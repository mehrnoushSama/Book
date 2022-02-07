package com.example.book.model


import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize

@Parcelize
data class Author(
    @SerializedName("authorFullName")
    val authorFullName: String,
    @SerializedName("authorId")
    val authorId: Int,
    @SerializedName("bookLibraryAuthorId")
    val bookLibraryAuthorId: Int,
    @SerializedName("bookLibraryId")
    val bookLibraryId: Int
) : Parcelable