package com.windy.notetakingapp.ui.notes

import com.windy.notetakingapp.data.Notes

interface NotesListener {
    fun noteListener(note:Notes)
}