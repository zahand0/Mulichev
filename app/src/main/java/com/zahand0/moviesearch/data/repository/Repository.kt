package com.zahand0.moviesearch.data.repository

import androidx.paging.PagingData
import com.zahand0.moviesearch.domain.model.Film
import com.zahand0.moviesearch.domain.repository.RemoteDataSource
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class Repository @Inject constructor(
    private val remote: RemoteDataSource
) {

    fun getAllFilms(): Flow<PagingData<Film>> {
        return remote.getAllFilms()
    }

    fun getFilm(id: Int): Flow<Film> {
        return remote.getFilm(id)
    }
//    fun searchFilms(query: String): Flow<PagingData<Film>> {
//        return remote.searchFilms(query = query)
//    }

}