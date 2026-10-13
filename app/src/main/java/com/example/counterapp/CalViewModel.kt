package com.example.counterapp

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel

class CalViewModel : ViewModel() {

    var count by mutableStateOf(0)
        private set

    // Fungsi menambah nilai (Up)
    fun increment() {
        count++
    }

    // Fungsi mengurangi nilai (Down)
    fun decrement() {
        if (count > 0) {
            count--
        }
    }

    // Fungsi mereset nilai ke 0 (Reset)
    fun reset() {
        count = 0
    }
}