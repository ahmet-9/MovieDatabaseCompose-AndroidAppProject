package com.ahmetbadem.moviedatabasecompose.data.remote.dto

import com.ahmetbadem.moviedatabasecompose.domain.model.Movie
import com.ahmetbadem.moviedatabasecompose.data.remote.dto.Search

data class MoviesDto(
    val Response: String,
    val Search: List<Search>,
    val totalResults: String
)

fun MoviesDto.toMovieList() :List<Movie> {
    return Search.map { search: Search -> Movie(search.Poster,search.Title,search.Year,search.imdbID) }
}