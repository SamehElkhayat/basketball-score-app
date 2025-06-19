package com.elkhayat.basketballscoreboard.viewmodel

// Import Android Jetpack components for lifecycle-aware data handling
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

// This ViewModel holds the score state for both Team A and Team B
// ViewModel helps preserve UI-related data during configuration changes (e.g. screen rotation)
class CounterViewModel : ViewModel() {

    // --- Team A ---

    // Private mutable state holder for Team A's score
    private var _liveCounterA = MutableLiveData(0)

    // Public immutable LiveData that the UI can observe, but cannot modify directly
    val counterA: LiveData<Int>
        get() = _liveCounterA

    // Add 1 point (Free Throw) to Team A's score
    fun incrementNumberA() {
        _liveCounterA.value = _liveCounterA.value?.plus(1)
    }

    // Add 2 points to Team A's score
    fun incrementNumberA2() {
        _liveCounterA.value = _liveCounterA.value?.plus(2)
    }

    // Add 3 points to Team A's score
    fun incrementNumberA3() {
        _liveCounterA.value = _liveCounterA.value?.plus(3)
    }

    // --- Team B ---

    // Private mutable state holder for Team B's score
    private var _liveCounterB = MutableLiveData(0)

    // Public immutable LiveData that the UI can observe
    val counterB: LiveData<Int>
        get() = _liveCounterB

    // Add 1 point (Free Throw) to Team B's score
    fun incrementNumberB() {
        _liveCounterB.value = _liveCounterB.value?.plus(1)
    }

    // Add 2 points to Team B's score
    fun incrementNumberB2() {
        _liveCounterB.value = _liveCounterB.value?.plus(2)
    }

    // Add 3 points to Team B's score
    fun incrementNumberB3() {
        _liveCounterB.value = _liveCounterB.value?.plus(3)
    }

    // --- Reset both team scores to zero ---
    fun reset() {
        _liveCounterA.value = 0
        _liveCounterB.value = 0
    }
}
