package com.kt.android.mvvm

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.activity.viewModels

import androidx.lifecycle.Lifecycle
import androidx.lifecycle.lifecycleScope
import androidx.lifecycle.repeatOnLifecycle
import com.kt.android.databinding.ActivityMvvmBinding
import com.sun.m.base.BaseActivity
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlin.concurrent.thread

class DiceRollActivity : BaseActivity<ActivityMvvmBinding>() {

    private val viewModel: DiceRollViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        lifecycleScope.launch {
            viewModel.rollDice()
            Log.d("DiceRollActivity","${Thread.currentThread().name}")
            delay(5000)
            viewModel.diceUiState.observe(this@DiceRollActivity){
                binding.mvvm1.text = "${it.numberOfRolls}"
                binding.mvvm2.text = "${it.firstDieValue}"
                binding.mvvm3.text = "${it.secondDieValue}"
            }
        }
    }

}