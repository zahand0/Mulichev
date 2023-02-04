package com.zahand0.moviesearch.di

import com.zahand0.moviesearch.data.repository.Repository
import com.zahand0.moviesearch.domain.use_cases.UseCases
import com.zahand0.moviesearch.domain.use_cases.get_all_films.GetAllFilmsUseCase
import com.zahand0.moviesearch.domain.use_cases.get_film.GetFilmUseCase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object RepositoryModule {

    @Provides
    @Singleton
    fun provideUseCases(repository: Repository): UseCases {
        return UseCases(
            getAllFilmsUseCase = GetAllFilmsUseCase(repository),
            getFilmUseCase = GetFilmUseCase(repository)
        )
    }

}