package com.windy.notetakingapp.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.windy.notetakingapp.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fragment_notes)
    }
}