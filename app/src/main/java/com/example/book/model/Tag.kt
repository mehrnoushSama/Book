package com.example.book.model


import com.google.gson.annotations.SerializedName

data class Tag(
    @SerializedName("bookTagCode")
    val bookTagCode: String,
    @SerializedName("bookTagId")
    val bookTagId: Int,
    @SerializedName("bookTagTitle")
    val bookTagTitle: String
)