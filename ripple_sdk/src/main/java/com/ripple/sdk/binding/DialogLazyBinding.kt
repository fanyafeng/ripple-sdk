package com.ripple.sdk.binding

import android.app.Dialog
import androidx.viewbinding.ViewBinding

/**
 * Author: fanyafeng
 * Date: 2023/2/1 17:35
 * Email: fanyafeng@live.cn
 * Description:
 *///Github See: https://github.com/fanyafeng

inline fun <reified VB : ViewBinding> Dialog.inflate() = lazy {
    inflateBinding<VB>(layoutInflater).apply { setContentView(root) }
}
 