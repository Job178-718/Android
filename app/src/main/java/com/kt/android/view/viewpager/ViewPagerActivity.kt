package com.kt.android.view.viewpager

import android.os.Bundle
import androidx.viewpager2.widget.ViewPager2
import com.kt.android.databinding.ActivityViewpagerBinding
import com.sun.m.base.BaseActivity

class ViewPagerActivity : BaseActivity<ActivityViewpagerBinding>() {

    private lateinit var pagerAdapter: ViewPagerAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // 创建数据集
        val data = listOf("Page 1", "Page 2", "Page 3")

        // 实例化适配器并设置给ViewPager2
        pagerAdapter = ViewPagerAdapter(data)
        binding.viewPager.adapter = pagerAdapter
    }
}