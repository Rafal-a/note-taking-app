package com.windy.notetakingapp.data.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.windy.notetakingapp.data.Notes
import com.windy.notetakingapp.utils.Constant

@Database(entities = [Notes::class],version = Constant.TABLE_VERSION)
abstract class NoteDatabase:RoomDatabase() {
    abstract fun notesDao():NotesDao
}