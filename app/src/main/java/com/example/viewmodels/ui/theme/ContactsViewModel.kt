package com.example.viewmodels.ui.theme

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.graphics.Color
import androidx.lifecycle.ViewModel

class ContactsViewModel: ViewModel() {
    var backgroundColor by  mutableStateOf(Color.Cyan)
        private set
    fun changebackgroundColor() {
        backgroundColor = Color.Magenta
    }
}