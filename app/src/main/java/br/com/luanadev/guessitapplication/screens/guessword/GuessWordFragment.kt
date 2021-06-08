package br.com.luanadev.guessitapplication.screens.guessword

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import br.com.luanadev.guessitapplication.R
import br.com.luanadev.guessitapplication.databinding.GuessWordFragmentBinding

class GuessWordFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View {
        val binding: GuessWordFragmentBinding = DataBindingUtil.inflate(
            inflater, R.layout.guess_word_fragment, container, false)

        binding.playGameButton.setOnClickListener {
            findNavController().navigate(GuessWordFragmentDirections.actionGuessWordToGame())
        }
        return binding.root
    }
}