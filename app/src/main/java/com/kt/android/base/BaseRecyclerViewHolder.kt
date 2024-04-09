package com.kt.android.base

import androidx.recyclerview.widget.RecyclerView
import androidx.viewbinding.ViewBinding

open abstract class BaseRecyclerViewHolder<T,R : ViewBinding>(var binding: R) : RecyclerView.ViewHolder(binding.root){
    abstract fun bind(t:T)
}