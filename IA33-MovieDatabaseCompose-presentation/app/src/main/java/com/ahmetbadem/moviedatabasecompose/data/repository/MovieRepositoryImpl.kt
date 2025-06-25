package com.ahmetbadem.moviedatabasecompose.data.repository

import com.ahmetbadem.moviedatabasecompose.data.remote.MovieAPI
import com.ahmetbadem.moviedatabasecompose.data.remote.dto.MovieDetailDto
import com.ahmetbadem.moviedatabasecompose.data.remote.dto.MoviesDto
import com.ahmetbadem.moviedatabasecompose.domain.repository.MovieRepository
import javax.inject.Inject

class MovieRepositoryImpl @Inject constructor(private val api : MovieAPI) : MovieRepository {
    override suspend fun getMovies(search: String): MoviesDto {
        return api.getMovies(searchString = search)
    }
    override suspend fun getMovieDetail(imdbId: String): MovieDetailDto {
        return api.getMovieDetail(imdbId = imdbId)
    }
}