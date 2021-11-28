package com.windy.notetakingapp.data.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.windy.notetakingapp.data.Notes
import com.windy.notetakingapp.utils.Constant
import com.windy.notetakingapp.utils.Converter
import kotlinx.coroutines.InternalCoroutinesApi
import kotlinx.coroutines.internal.synchronized

@Database(entities = [Notes::class],version = Constant.TABLE_VERSION)
@TypeConverters(Converter::class)
abstract class NoteDatabase:RoomDatabase() {
    abstract fun notesDao():NotesDao

    companion object{

        private const val DATABASE_NAME = "NotesDatabase"

        @Volatile private var instance:NoteDatabase?=null

        @InternalCoroutinesApi
        fun getInstance(context: Context):NoteDatabase =  instance ?: synchronized(this)
        { buildDatabase(context)
            .also { instance = it }
        }

        fun getInstanceWithoutContext():NoteDatabase = instance!!


        private fun buildDatabase(context: Context):NoteDatabase = Room.databaseBuilder(context,
            NoteDatabase::class.java, DATABASE_NAME )
            .build()
        }
    }
