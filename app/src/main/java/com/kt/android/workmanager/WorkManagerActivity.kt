package com.kt.android.workmanager

import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.work.Constraints
import androidx.work.Data
import androidx.work.OneTimeWorkRequest
import androidx.work.WorkManager
import com.kt.android.databinding.ActivityWorkmanagerBinding
import com.sun.m.base.BaseActivity


class WorkManagerActivity: BaseActivity<ActivityWorkmanagerBinding>() {

    private lateinit var workManager:WorkManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        workManager = WorkManager.getInstance(applicationContext)

        val data: Data = Data.Builder()
            .putString(KEY_WORK_CONTENT, "I am the content of notification")
            .putString(KEY_WORK_TITLE, "Work Manager Test")
            .build()

        val constraints: Constraints = Constraints.Builder()
            .setRequiresBatteryNotLow(true)
            .build()

        val request: OneTimeWorkRequest = OneTimeWorkRequest.Builder(NotificationWorker::class.java)
            .setInputData(data)
            .setConstraints(constraints)
            .build()

        binding.tx.setOnClickListener {
            workManager.enqueue(request)
        }

        workManager.getWorkInfoByIdLiveData(request.id)
            .observe(this, Observer { workInfo ->
                if (workInfo != null) {
                    val status: String = workInfo.state.name
                    binding.tx.text = status.toString()
                }
            })
    }
    companion object {
        const val KEY_WORK_CONTENT: String = "content_work"
        const val KEY_WORK_TITLE: String = "title_work"
    }
}