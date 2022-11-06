package com.example.challenge6.model.movie

import com.google.gson.annotations.SerializedName

data class MovieDetailData (
    @SerializedName("poster_path")
    val posterPath: String?,
    @SerializedName("release_date")
    val releaseDate: String?,
    @SerializedName("title")
    val title: String?,
    @SerializedName("overview")
    val overview: String?
)