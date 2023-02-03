package com.ripple.sdk.application

import android.app.Application
import dagger.hilt.android.HiltAndroidApp


/**
 * Author: fanyafeng
 * Date: 2023/2/2 11:18
 * Email: fanyafeng@live.cn
 * Description:
 *///Github See: https://github.com/fanyafeng

@HiltAndroidApp
class RippleSdkApplication : Application() {

    override fun onCreate() {
        super.onCreate()
    }
}