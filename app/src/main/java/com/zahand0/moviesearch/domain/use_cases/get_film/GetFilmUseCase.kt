package com.zahand0.moviesearch.domain.use_cases.get_film

import com.zahand0.moviesearch.data.repository.Repository
import com.zahand0.moviesearch.domain.model.Film
import kotlinx.coroutines.flow.Flow

class GetFilmUseCase(
    private val repository: Repository
) {
    operator fun invoke(id: Int): Flow<Film> {
        return repository.getFilm(id)
    }
}