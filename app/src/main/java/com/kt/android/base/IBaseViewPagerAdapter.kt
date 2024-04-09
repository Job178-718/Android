package com.kt.android.base

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.viewbinding.ViewBinding
import com.kt.android.R
import com.kt.android.view.viewpager.ViewPagerAdapter

abstract class IBaseViewPagerAdapter<T, VH : RecyclerView.ViewHolder,B:ViewBinding>(private var mData: List<T>) :
    RecyclerView.Adapter<VH>() {

    override fun getItemCount(): Int {
        return mData.size
    }

    override fun onBindViewHolder(holder: VH, position: Int) {
        onBindItem(holder, mData[position])
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VH {
        val layoutInflater:LayoutInflater = LayoutInflater.from(parent.context)
        val  view: View = createView(layoutInflater,parent,viewType)
        return createVH(view)
    }

    abstract fun createVH(view:View):VH
    abstract fun createView(layoutInflater: LayoutInflater,parent: ViewGroup, viewType: Int):View
    abstract fun onBindItem(holder: VH, item: T)
}