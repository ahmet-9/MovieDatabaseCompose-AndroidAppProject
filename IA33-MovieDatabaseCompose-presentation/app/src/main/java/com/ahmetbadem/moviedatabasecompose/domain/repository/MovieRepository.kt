package com.ahmetbadem.moviedatabasecompose.domain.repository

import com.ahmetbadem.moviedatabasecompose.data.remote.dto.MovieDetailDto
import com.ahmetbadem.moviedatabasecompose.data.remote.dto.MoviesDto

interface MovieRepository {

    suspend fun getMovies(search : String) : MoviesDto

    suspend fun getMovieDetail(imdbId : String) : MovieDetailDto


}