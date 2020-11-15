package br.com.luanadev.guessitapplication.screens.game

import android.os.Bundle
import android.text.format.DateUtils
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.NavHostFragment.findNavController
import androidx.navigation.fragment.findNavController
import br.com.luanadev.guessitapplication.R
import br.com.luanadev.guessitapplication.databinding.GameFragmentBinding

/**
 * Fragment where the game is played
 */

/**
 * Fragment where the game is played
 */
class GameFragment : Fragment() {

    private lateinit var viewModel: GameViewModel

    private lateinit var binding: GameFragmentBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {

        // Inflate view and obtain an instance of the binding class
        binding = DataBindingUtil.inflate(
            inflater,
            R.layout.game_fragment,
            container,
            false
        )

        // Get the viewmodel
        viewModel = ViewModelProvider(this).get(GameViewModel::class.java)

        binding.correctButton.setOnClickListener {
            viewModel.onCorrect()
        }
        binding.skipButton.setOnClickListener {
            viewModel.onSkip()
        }

        /** Setting up LiveData observation relationship **/
        viewModel.word.observe(viewLifecycleOwner, Observer { newWord ->
            binding.wordText.text = newWord
        })

        viewModel.score.observe(viewLifecycleOwner, Observer { newScore ->
            binding.scoreText.text = newScore.toString()
        })

        viewModel.currentTime.observe(viewLifecycleOwner, Observer { newTime ->
            binding.timerText.text = DateUtils.formatElapsedTime(newTime)

        })

        // Sets up event listening to navigate the player when the game is finished
        viewModel.eventGameFinish.observe(viewLifecycleOwner, Observer { isFinished ->
            if (isFinished) {
                val currentScore = viewModel.score.value ?: 0
                val action = GameFragmentDirections.actionGameToScore(currentScore)
                findNavController(this).navigate(action)
                viewModel.onGameFinishComplete()
            }
        })
        return binding.root

    }

}