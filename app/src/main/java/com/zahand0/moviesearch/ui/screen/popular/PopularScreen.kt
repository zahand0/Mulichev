package com.zahand0.moviesearch.ui.screen.popular

import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavHostController
import androidx.paging.compose.collectAsLazyPagingItems
import com.zahand0.moviesearch.R

@Composable
fun HomeScreen(
    navController: NavHostController,
    viewModel: PopularViewModel = hiltViewModel()
) {
    val allFilms = viewModel.getAllFilms.collectAsLazyPagingItems()

    Scaffold(
        topBar = {
            CommonTopBar(
                title = stringResource(R.string.popular),
                onSearchClicked = {
//                    navController.navigate(Screen.Search.route)
                }
            )
        },
        content = { padding ->
            ListContent(
                modifier = Modifier.padding(padding),
                heroes = allHeroes,
                navController = navController
            )
        },
        backgroundColor = MaterialTheme.colors.surface
    )
}