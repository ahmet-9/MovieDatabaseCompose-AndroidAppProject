package com.ahmetbadem.moviedatabasecompose.presentation.movies

sealed class MoviesEvent {
    data class Search(val searchString :String) : MoviesEvent()

}
