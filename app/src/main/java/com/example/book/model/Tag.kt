package com.example.book.model


import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize

@Parcelize
data class Tag(
    @SerializedName("bookTagCode")
    val bookTagCode: String,
    @SerializedName("bookTagId")
    val bookTagId: Int,
    @SerializedName("bookTagTitle")
    val bookTagTitle: String
) : Parcelable