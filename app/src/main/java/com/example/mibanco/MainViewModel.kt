package com.example.mibanco

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {
    var showBottomSheet by mutableStateOf(false)
    var showDialogRecompensas by mutableStateOf(false)
}