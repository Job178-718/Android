package com.kt.android.base

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.viewbinding.ViewBinding

/**
 * T List数据类型
 * R item布局
 */
abstract class IBaseAdapter<T, R : ViewBinding> : RecyclerView.Adapter<BaseRecyclerViewHolder<T,R>>() {

    var list: MutableList<T>? = null

    fun setData(l: MutableList<T>) {
        list?.clear()
        list = l
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BaseRecyclerViewHolder<T,R> {
        val layoutInflater = LayoutInflater.from(parent.context)
        val binding = createBind(layoutInflater, parent)
        return createViewHolder(binding)
    }



    override fun getItemCount(): Int {
        return list?.size ?: 0
    }


    abstract fun createBind(layoutInflater: LayoutInflater?, parent: ViewGroup): R

    abstract fun createViewHolder(binding: R):BaseRecyclerViewHolder<T,R>

    abstract override fun onBindViewHolder(holder: BaseRecyclerViewHolder<T,R>, position: Int)

}

