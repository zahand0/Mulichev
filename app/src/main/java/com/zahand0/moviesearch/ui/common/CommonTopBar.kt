package com.zahand0.moviesearch.ui.screen.popular

import android.content.res.Configuration.UI_MODE_NIGHT_YES
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.zahand0.moviesearch.ui.theme.MovieSearchTheme
import com.zahand0.moviesearch.R

@Composable
fun CommonTopBar(
    title: String,
    onSearchClicked: () -> Unit
) {
    TopAppBar(
        title = {
            Text(
                text = title,
                color = MaterialTheme.colors.onBackground
            )
        },
        backgroundColor = MaterialTheme.colors.background,
        actions = {
            IconButton(onClick = onSearchClicked) {
                Icon(
                    imageVector = Icons.Default.Search,
                    contentDescription = stringResource(R.string.search_icon),
                    tint = MaterialTheme.colors.primary
                )
            }
        },
        elevation = 4.dp
    )
}

@Preview
@Preview(uiMode = UI_MODE_NIGHT_YES)
@Composable
fun HomeTopBarPreview() {
    MovieSearchTheme() {
        CommonTopBar(title = "Popular") {}
    }
}
