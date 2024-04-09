package com.kt.android.utils

import android.content.Context
import android.widget.Toast

open class ToastUtils {

    companion object{
        fun shortToast(context: Context,text:String){
            Toast.makeText(context,text,Toast.LENGTH_SHORT).show()
        }

        fun longToast(context: Context,text:String){
            Toast.makeText(context,text,Toast.LENGTH_SHORT).show()
        }
    }

}