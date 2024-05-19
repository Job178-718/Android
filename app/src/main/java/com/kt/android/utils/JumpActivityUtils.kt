package com.kt.android.utils

import android.content.Context
import android.content.Intent
import android.widget.Toast

open class JumpActivityUtils {

    companion object{
        fun jumpActivity(context: Context,cls: Class<*>){
            context.startActivity(Intent(context,cls))
        }
    }

}