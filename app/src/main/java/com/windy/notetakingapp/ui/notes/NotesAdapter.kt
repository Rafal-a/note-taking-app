package com.windy.notetakingapp.ui.notes

import com.windy.notetakingapp.R
import com.windy.notetakingapp.data.Notes
import com.windy.notetakingapp.ui.BaseAdapter

class NotesAdapter( item:List<Notes> , listener:NotesListener ):BaseAdapter<Notes>(item, listener){
    override val layoutId: Int = R.layout.item_note
}