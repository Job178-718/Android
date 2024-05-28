package com.kt.android.mvvm


import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.kt.android.bean.DiceUiState
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

/*
1.ViewModel
2.Flow
* */
class DiceRollViewModel : ViewModel() {

   val diceUiState = MutableLiveData<DiceUiState>()

    suspend fun rollDice() {
        withContext(Dispatchers.IO){
            diceUiState.postValue(DiceUiState(12,10,45))
        }
    }

}

