package com.windy.notetakingapp.data

import com.windy.notetakingapp.data.database.NoteDatabase
import io.reactivex.rxjava3.core.Completable

class NotesRepository {

    val dao = NoteDatabase.getInstanceWithoutContext().notesDao()

    suspend fun insertNewNote(note:Notes) = dao.insetData(note)

    suspend fun updateCurrentNote(note:Notes) = dao.updateData(note)

    suspend fun deleteCurrentNote(note:Notes) = dao.deleteData(note)

     fun getAllNotes(note:Notes) = dao.getAllNotes()



}