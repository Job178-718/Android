package com.kt.android.view.recyclerview

import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.kt.android.bean.Student
import com.kt.android.databinding.ActivityRecyclerviewBinding
import com.sun.m.base.BaseActivity

class RecyclerViewActivity : BaseActivity<ActivityRecyclerviewBinding>() {

    private var list = mutableListOf<Student>()
    private fun initData() {
        for(i in 0..10){
            list.add(Student(i,"李","男","23"))
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        initData()
        super.onCreate(savedInstanceState)
        val recyclerAdapter = RecyclerAdapter()
        list?.let { recyclerAdapter.setData(it) }
        binding.recyclerview.layoutManager = LinearLayoutManager(this)
        binding.recyclerview.adapter = recyclerAdapter

    }
}