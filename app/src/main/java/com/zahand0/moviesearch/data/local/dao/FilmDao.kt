package com.zahand0.moviesearch.data.local.dao

import androidx.paging.PagingSource
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.zahand0.moviesearch.domain.model.Film

@Dao
interface FilmDao {

    @Query("SELECT * FROM film_table ORDER BY filmId ASC")
    fun getAllFilms(): PagingSource<Int, Film>

    @Query("SELECT * FROM film_table WHERE filmId=:filmId")
    fun getSelectedFilm(filmId: Int): Film

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun addFilms(films: List<Film>)

    @Query("DELETE FROM film_table")
    suspend fun deleteAllFilms()

}