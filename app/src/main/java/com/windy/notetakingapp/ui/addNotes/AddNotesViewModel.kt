package com.windy.notetakingapp.ui.addNotes

import androidx.lifecycle.*
import com.windy.notetakingapp.data.Notes
import com.windy.notetakingapp.data.NotesRepository
import kotlinx.coroutines.launch
import java.util.*

class AddNotesViewModel():ViewModel() {

    val title = MutableLiveData<String>()
    val content = MutableLiveData<String>()
    val repository = NotesRepository()

     val notes: LiveData<List<Notes>> = repository.dao.getAllNotes().asLiveData()


    fun addNote(){
        viewModelScope.launch {
            repository.insertNewNote( Notes(0,
                title.value.toString(),
                content.value.toString(),
                Date(),
            )
            )
            title.postValue("")
            content.postValue("")
        }
    }

}