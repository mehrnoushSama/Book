package com.example.book.model


import com.google.gson.annotations.SerializedName

data class BookDetail(
    @SerializedName("authors")
    val authors: List<Author>,
    @SerializedName("fullDetail")
    val fullDetail: FullDetail,
    @SerializedName("hasBookBefore")
    val hasBookBefore: Boolean,
    @SerializedName("tags")
    val tags: List<Tag>
)