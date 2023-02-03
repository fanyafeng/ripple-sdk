package com.ripple.sdk.binding

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.viewbinding.ViewBinding


/**
 * Author: fanyafeng
 * Date: 2023/2/1 18:52
 * Email: fanyafeng@live.cn
 * Description:
 *///Github See: https://github.com/fanyafeng


class BindingViewHolder<VB : ViewBinding>(val binding: VB) : RecyclerView.ViewHolder(binding.root)

inline fun <reified VB : ViewBinding> newBindingViewHolder(parent: ViewGroup): BindingViewHolder<VB> {
    return BindingViewHolder(newBinding(parent))
}

inline fun <reified VB : ViewBinding> newBinding(parent: ViewGroup): VB {
    val method = VB::class.java.getMethod(
        "inflate",
        LayoutInflater::class.java,
        ViewGroup::class.java,
        Boolean::class.java
    )
    return method.invoke(null, LayoutInflater.from(parent.context), parent, false) as VB
}