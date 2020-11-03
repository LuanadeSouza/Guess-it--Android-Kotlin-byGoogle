package br.com.luanadev.guessitapplication.screens.game

import android.util.Log
import androidx.lifecycle.ViewModel

class GameViewModel : ViewModel() {
    init {
        Log.i("GmaeViewModel", "GameViewModel Created!")
    }

    override fun onCleared() {
        super.onCleared()
        Log.i("GmaeViewModel", "GameViewModel Destroy")
    }
}