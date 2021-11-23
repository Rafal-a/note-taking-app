package com.windy.notetakingapp.ui.addNotes

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.ViewModel
import androidx.recyclerview.widget.DiffUtil
import com.windy.notetakingapp.R
import com.windy.notetakingapp.databinding.FragmentAddNoteBinding
import com.windy.notetakingapp.ui.BaseFragment


class AddNoteFragment : BaseFragment<FragmentAddNoteBinding>(R.layout.fragment_notes) {
    override val LOG_TAG = AddNoteFragment::class.java.simpleName
    override val viewModel : AddNotesViewModel by activityViewModels()
    override val bindingInflater: (LayoutInflater, Int, ViewGroup?, Boolean) -> FragmentAddNoteBinding
        =DataBindingUtil::inflate

    override fun setupView() {

    }

}