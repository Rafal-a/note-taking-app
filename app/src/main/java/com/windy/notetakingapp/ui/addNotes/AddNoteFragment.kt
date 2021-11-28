package com.windy.notetakingapp.ui.addNotes

import android.os.Bundle
import android.view.KeyEvent
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.ViewModel
import androidx.navigation.Navigation
import androidx.recyclerview.widget.DiffUtil
import com.windy.notetakingapp.R
import com.windy.notetakingapp.data.NotesRepository
import com.windy.notetakingapp.databinding.FragmentAddNoteBinding
import com.windy.notetakingapp.ui.BaseFragment


class AddNoteFragment : BaseFragment<FragmentAddNoteBinding>(R.layout.fragment_add_note) ,View.OnClickListener{
    override val LOG_TAG = AddNoteFragment::class.java.simpleName
    override val viewModel : AddNotesViewModel by activityViewModels<AddNotesViewModel>()
    override val bindingInflater: (LayoutInflater, Int, ViewGroup?, Boolean) -> FragmentAddNoteBinding
        =DataBindingUtil::inflate

    override fun setupView() {

        binding.buttonAddNewNote.setOnClickListener(this)

    }

    override fun onClick(view: View?) {
        viewModel.addNote()
        view?.let { Navigation.findNavController(it).popBackStack() }
    }

}