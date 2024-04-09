package com.kt.android.base

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import androidx.viewbinding.ViewBinding

/**
 * T为数据
 *
 */
open abstract class BaseViewPagerHolder<T>(itemView: View) : RecyclerView.ViewHolder(itemView){
    abstract fun bind(t:T)
}