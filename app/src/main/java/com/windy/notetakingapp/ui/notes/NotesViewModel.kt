package com.windy.notetakingapp.ui.notes

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.windy.notetakingapp.data.Notes
import com.windy.notetakingapp.data.NotesRepository
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch

class NotesViewModel:ViewModel(),NotesListener {

    val repository = NotesRepository()

    private val _notes = MutableLiveData<List<Notes>>()
     val notes : LiveData<List<Notes>> = _notes

    init {
        loadNotes()
    }


    private  fun loadNotes(){
        viewModelScope.launch {
            repository.dao.getAllNotes().collect {
                _notes.postValue(it)
            }
        }
    }

    override fun noteListener(note: Notes) {
        TODO("Not yet implemented")
    }
}