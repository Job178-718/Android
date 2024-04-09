package com.kt.android.view.recyclerview

import android.view.LayoutInflater
import android.view.ViewGroup
import com.kt.android.base.BaseRecyclerViewHolder
import com.kt.android.base.IBaseAdapter
import com.kt.android.bean.Student
import com.kt.android.databinding.RecyclerviewItemBinding

class RecyclerAdapter():IBaseAdapter<Student,RecyclerviewItemBinding>() {

    class VH(binding : RecyclerviewItemBinding) : BaseRecyclerViewHolder<Student,RecyclerviewItemBinding>(binding){
        override fun bind(student: Student){
            binding.sex.text  = student.sex
            binding.age.text  = student.age
            binding.name.text  = student.name
        }

    }

    override fun createViewHolder(binding: RecyclerviewItemBinding): VH {
        return VH(binding)
    }

    override fun createBind(
        layoutInflater: LayoutInflater?,
        parent: ViewGroup
    ): RecyclerviewItemBinding {
      return  RecyclerviewItemBinding.inflate(layoutInflater!!,parent,false)
    }

    override fun onBindViewHolder(
        holder: BaseRecyclerViewHolder<Student, RecyclerviewItemBinding>,
        position: Int
    ) {
        val student = list?.get(position)
        holder.bind(student!!)
    }

}