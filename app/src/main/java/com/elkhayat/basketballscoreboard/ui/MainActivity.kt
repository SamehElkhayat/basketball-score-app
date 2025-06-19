package com.elkhayat.basketballscoreboard.ui

// Import required Android and Jetpack libraries
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import com.elkhayat.basketballscoreboard.viewmodel.CounterViewModel
import com.elkhayat.basketballscoreboard.databinding.ActivityMainBinding
import com.google.android.material.snackbar.Snackbar

// Main Activity class for the Basketball Score Game
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // View Binding: Automatically links layout views to code
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Get an instance of the ViewModel (which stores the scores)
        val viewModel = ViewModelProvider(this)[CounterViewModel::class.java]

        // Local variables to hold team scores (used only for checking winner)
        var scoreA: Int = 0
        var scoreB: Int = 0

        // When "End Game" button is clicked, show the winner using a Snackbar
        binding.endGameBtn.setOnClickListener {
            when {
                scoreA > scoreB -> {
                    Snackbar.make(binding.root, "The Winner is Team A", Snackbar.LENGTH_SHORT).show()
                }
                scoreB > scoreA -> {
                    Snackbar.make(binding.root, "The Winner is Team B", Snackbar.LENGTH_SHORT).show()
                }
                else -> {
                    Snackbar.make(binding.root, "No Winner", Snackbar.LENGTH_SHORT).show()
                }
            }
        }

        // Observe score changes for Team A from ViewModel
        viewModel.counterA.observe(this) { newScore ->
            binding.scoreATv.text = newScore.toString()      // Update UI
            scoreA = newScore                                // Save value locally
        }

        // Observe score changes for Team B from ViewModel
        viewModel.counterB.observe(this) { newScore ->
            binding.scoreBTv.text = newScore.toString()
            scoreB = newScore
        }

        // --- Buttons for Team A ---
        binding.threeABtn.setOnClickListener {
            viewModel.incrementNumberA3() // +3 points
        }

        binding.twoABtn.setOnClickListener {
            viewModel.incrementNumberA2() // +2 points
        }

        binding.freeThrowABtn.setOnClickListener {
            viewModel.incrementNumberA() // +1 point (Free Throw)
        }

        // --- Buttons for Team B ---
        binding.threeBBtn.setOnClickListener {
            viewModel.incrementNumberB3()
        }

        binding.twoBBtn.setOnClickListener {
            viewModel.incrementNumberB2()
        }

        binding.freeThrowBBtn.setOnClickListener {
            viewModel.incrementNumberB()
        }

        // Reset both teams' scores
        binding.resetBtn.setOnClickListener {
            viewModel.reset()
        }
    }
}
