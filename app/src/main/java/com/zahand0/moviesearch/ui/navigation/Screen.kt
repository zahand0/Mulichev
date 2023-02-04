package com.zahand0.moviesearch.ui.navigation

import com.zahand0.moviesearch.util.Constants

sealed class Screen(val route: String) {
    object MovieList : Screen(route = "movie_list_screen")
    object Search : Screen(route = "search_screen")
    object Movie : Screen(route = "movie_screen/{${Constants.MOVIE_SCREEN_ARGUMENT_KEY}}") {
        fun passId(id: String): String {
            return "game_screen/$id"
        }
    }
}
