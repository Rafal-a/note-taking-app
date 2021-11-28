package com.windy.notetakingapp.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.windy.notetakingapp.R
import com.windy.notetakingapp.data.database.NoteDatabase
import com.windy.notetakingapp.databinding.ActivityMainBinding
import kotlinx.coroutines.InternalCoroutinesApi

class MainActivity : AppCompatActivity() {
    private lateinit var _binding: ActivityMainBinding

    @InternalCoroutinesApi
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        NoteDatabase.getInstance(applicationContext)

    }
}