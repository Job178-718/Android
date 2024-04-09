package com.kt.android

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.kt.android.databinding.ActivityMainBinding
import com.kt.android.utils.JumpActivityUtils
import com.kt.android.utils.ToastUtils
import com.kt.android.view.ViewActivity
import com.kt.android.view.recyclerview.RecyclerViewActivity
import com.sun.m.base.BaseActivity

class MainActivity : BaseActivity<ActivityMainBinding>() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding.view.setOnClickListener{
            JumpActivityUtils.jumpActivity(this,ViewActivity::class.java)
        }
    }
}