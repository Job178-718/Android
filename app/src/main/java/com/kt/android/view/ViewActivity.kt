package com.kt.android.view

import android.os.Bundle
import com.kt.android.databinding.ActivityViewBinding
import com.kt.android.utils.JumpActivityUtils
import com.kt.android.view.recyclerview.RecyclerViewActivity
import com.kt.android.view.viewpager.ViewPagerActivity
import com.sun.m.base.BaseActivity

class ViewActivity:BaseActivity<ActivityViewBinding>() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding.recyclerview.setOnClickListener {
            JumpActivityUtils.jumpActivity(this,RecyclerViewActivity::class.java)
        }
        binding.viewpager.setOnClickListener {
            JumpActivityUtils.jumpActivity(this,ViewPagerActivity::class.java)
        }
    }
}