package com.kt.android

import android.os.Bundle
import com.kt.android.databinding.ActivityMainBinding
import com.kt.android.mvvm.DiceRollActivity
import com.kt.android.http.HttpActivity
import com.kt.android.utils.JumpActivityUtils
import com.kt.android.view.ViewActivity
import com.sun.m.base.BaseActivity

class MainActivity : BaseActivity<ActivityMainBinding>() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding.view.setOnClickListener{
            JumpActivityUtils.jumpActivity(this,ViewActivity::class.java)
        }
        /*MVVM页面*/
        binding.mvvm.setOnClickListener{
            JumpActivityUtils.jumpActivity(this,DiceRollActivity::class.java)
        }
        /*MVVM页面*/
        binding.http.setOnClickListener{
            JumpActivityUtils.jumpActivity(this,HttpActivity::class.java)
        }
    }
}