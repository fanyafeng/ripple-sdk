package com.ripple.sdk.binding

import android.app.Activity
import androidx.viewbinding.ViewBinding

/**
 * Author: fanyafeng
 * Date: 2023/2/1 18:50
 * Email: fanyafeng@live.cn
 * Description:
 *///Github See: https://github.com/fanyafeng


inline fun <reified VB : ViewBinding> Activity.inflate() = lazy {
    inflateBinding<VB>(layoutInflater).apply { setContentView(root) }
}