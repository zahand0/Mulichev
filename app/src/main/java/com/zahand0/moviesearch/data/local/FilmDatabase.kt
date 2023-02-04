package com.zahand0.moviesearch.data.local

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.zahand0.moviesearch.data.local.dao.FilmDao
import com.zahand0.moviesearch.data.local.dao.FilmRemoteKeysDao
import com.zahand0.moviesearch.domain.model.Film
import com.zahand0.moviesearch.domain.model.FilmRemoteKeys

@Database(
    entities = [Film::class, FilmRemoteKeys::class],
    version = 1
)

@TypeConverters(DatabaseConverter::class)
abstract class FilmDatabase : RoomDatabase() {

    abstract fun filmDao(): FilmDao

    abstract fun filmRemoteKeysDao(): FilmRemoteKeysDao

}