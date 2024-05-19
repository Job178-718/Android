package com.kt.android.http

import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.util.Log
import androidx.lifecycle.lifecycleScope

import com.kt.android.databinding.ActivityHttpBinding
import com.kt.android.databinding.ActivityOkhttpBinding
import com.kt.android.utils.HttpUtil
import com.sun.m.base.BaseActivity
import kotlinx.coroutines.Dispatchers.IO
import kotlinx.coroutines.async
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import okhttp3.Dispatcher

class OkHttpActivity : BaseActivity<ActivityOkhttpBinding>() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        lifecycleScope.launch {
            withContext(IO){
                val get =  HttpUtil.get("http://192.168.50.153:8081/user/map")
                binding.data.text = get.toString()
            }
        }

    }

}