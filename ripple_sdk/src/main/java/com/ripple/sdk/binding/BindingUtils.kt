package com.ripple.sdk.binding

import android.view.LayoutInflater
import androidx.annotation.MainThread
import androidx.viewbinding.ViewBinding

/**
 * Author: fanyafeng
 * Date: 2023/2/1 18:34
 * Email: fanyafeng@live.cn
 * Description:
 *///Github See: https://github.com/fanyafeng


@MainThread
inline fun <reified VB : ViewBinding> inflateBinding(layoutInflater: LayoutInflater) =
    VB::class.java.getMethod("inflate", LayoutInflater::class.java)
        .invoke(null, layoutInflater) as VB