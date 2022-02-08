package com.example.book.model


import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize

@Parcelize
data class Result(
    @SerializedName("authors")
    val authors: List<Author>,
    @SerializedName("fullDetail")
    val fullDetail: FullDetail,
    @SerializedName("hasBookBefore")
    val hasBookBefore: Boolean,
    @SerializedName("tags")
    val tags: List<Tag>
) : Parcelable