package com.kt.android.view.viewpager

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import androidx.viewbinding.ViewBinding
import com.kt.android.R
import com.kt.android.base.IBaseViewPagerAdapter
import com.kt.android.databinding.ViewpagerItemBinding

class ViewPagerAdapter(private var mData : List<String>): IBaseViewPagerAdapter<String,ViewPagerAdapter.ViewHolder,ViewpagerItemBinding>(mData) {

    override fun onBindItem(holder: ViewHolder, item: String) {
       holder.bind(item)
    }

    override fun createVH(view: View): ViewHolder {
        return ViewHolder(view)
    }

    override fun createView(
        layoutInflater: LayoutInflater,
        parent: ViewGroup,
        viewType: Int
    ): View {
        return ViewpagerItemBinding.inflate(layoutInflater,parent,false).root
    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        val item:TextView = itemView.findViewById(R.id.tv_viewpager)

        fun bind(text: String) {
            item.text = text
        }

    }
}