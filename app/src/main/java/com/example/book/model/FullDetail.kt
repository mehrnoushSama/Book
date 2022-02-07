package com.example.book.model


import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize

@Parcelize
data class FullDetail(
    @SerializedName("bookLibraryGradeFieldId")
    val bookLibraryGradeFieldId: Int,
    @SerializedName("bookLibraryId")
    val bookLibraryId: Int,
    @SerializedName("bookPrice")
    val bookPrice: Int,
    @SerializedName("bookTitle")
    val bookTitle: String,
    @SerializedName("eBookPrice")
    val eBookPrice: Int,
    @SerializedName("edition")
    val edition: String,
    @SerializedName("filePreviewUrl")
    val filePreviewUrl: String,
    @SerializedName("fullDescription")
    val fullDescription: String,
    @SerializedName("iconUrl")
    val iconUrl: String,
    @SerializedName("isInteractive")
    val isInteractive: Boolean,
    @SerializedName("isOldSchoolSystem")
    val isOldSchoolSystem: Boolean,
    @SerializedName("pageCount")
    val pageCount: Int,
    @SerializedName("seriesTitle")
    val seriesTitle: String,
    @SerializedName("volumeOfFile")
    val volumeOfFile: String,
    @SerializedName("year")
    val year: Int
) : Parcelable