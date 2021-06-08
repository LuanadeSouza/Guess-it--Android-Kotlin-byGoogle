package br.com.luanadev.guessitapplication.screens.game

import android.util.Log
import androidx.lifecycle.ViewModel

class GameViewModel : ViewModel() {
    var word = ""
    var score = 0
    private lateinit var wordList: MutableList<String>

    private fun resetList() {
        wordList = mutableListOf(
            "rainha",
            "hospital",
            "basquetebol",
            "gato",
            "mudança",
            "Caracol",
            "sopa",
            "calendário",
            "triste",
            "mesa",
            "guitarra",
            "casa",
            "estrada de ferro",
            "zebra",
            "geléia",
            "carro",
            "Corvo",
            "comércio",
            "saco",
            "lista",
            "bolha"
        )
        wordList.shuffle()
    }

    init {
        Log.i("GameViewModel", "GameViewModel created!")
        resetList()
        nextWord()
    }

    override fun onCleared() {
        super.onCleared()
        Log.i("GameViewModel", "GameViewModel destroyed!")
    }

    fun onSkip() {
        score--
        nextWord()
    }

    fun onCorrect() {
        score++
        nextWord()
    }

    private fun nextWord() {
        if (wordList.isNotEmpty()) {
            word = wordList.removeAt(0)
        }
    }
}