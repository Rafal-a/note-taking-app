package com.windy.notetakingapp.data.database

import androidx.room.*
import com.windy.notetakingapp.data.Notes
import com.windy.notetakingapp.utils.Constant

@Dao
interface NotesDao {

    @Insert
    fun insetData(notes: Notes)

    @Delete
    fun deleteData(notes:Notes)

    @Update
    fun updateData(notes:Notes)

    @Query("SELECT * FROM Notes")
    fun getAllNotes():List<Notes>

}