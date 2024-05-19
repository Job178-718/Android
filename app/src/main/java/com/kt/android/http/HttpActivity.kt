package com.kt.android.http

import android.os.Bundle

import com.kt.android.databinding.ActivityHttpBinding
import com.kt.android.utils.JumpActivityUtils
import com.sun.m.base.BaseActivity

class HttpActivity : BaseActivity<ActivityHttpBinding>() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding.okhttp.setOnClickListener {
            JumpActivityUtils.jumpActivity(HttpActivity@this,OkHttpActivity::class.java)
        }
    }

}