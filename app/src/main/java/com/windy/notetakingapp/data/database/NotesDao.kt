package com.windy.notetakingapp.data.database

import androidx.room.*
import com.windy.notetakingapp.data.Notes
import com.windy.notetakingapp.utils.Constant
import io.reactivex.rxjava3.core.Completable
import io.reactivex.rxjava3.core.Observable
import kotlinx.coroutines.flow.Flow

@Dao
interface NotesDao {

    @Insert
    suspend fun insetData(notes: Notes)

    @Delete
    suspend fun deleteData(notes:Notes)

    @Update
    suspend fun updateData(notes:Notes)

    @Query("SELECT * FROM Notes ORDER BY id DESC")
     fun getAllNotes():Flow<List<Notes>>

}