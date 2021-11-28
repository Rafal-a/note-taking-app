package com.windy.notetakingapp.ui.notes

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.ViewModel
import androidx.navigation.Navigation
import com.windy.notetakingapp.R
import com.windy.notetakingapp.databinding.FragmentNotesBinding
import com.windy.notetakingapp.ui.BaseFragment


class NotesFragment : BaseFragment<FragmentNotesBinding>(R.layout.fragment_notes) {
    override val LOG_TAG = NotesFragment::class.java.simpleName
    override val viewModel: NotesViewModel by activityViewModels()
    override val bindingInflater: (LayoutInflater, Int, ViewGroup?, Boolean) -> FragmentNotesBinding
        =DataBindingUtil::inflate

    override fun setupView() {
        binding.recyclerView.adapter = NotesAdapter(mutableListOf(),viewModel)

        binding.buttonAddNewNote.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.action_notesFragment_to_addNoteFragment)
        }
    }


}