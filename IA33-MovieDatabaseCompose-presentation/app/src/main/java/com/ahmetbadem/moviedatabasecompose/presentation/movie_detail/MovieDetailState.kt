package com.ahmetbadem.moviedatabasecompose.presentation.movie_detail

import com.ahmetbadem.moviedatabasecompose.domain.model.Movie
import com.ahmetbadem.moviedatabasecompose.domain.model.MovieDetail

data class MovieDetailState(
    val isLoading : Boolean = false,
    val movie : MovieDetail? = null,
    val error : String = ""
)