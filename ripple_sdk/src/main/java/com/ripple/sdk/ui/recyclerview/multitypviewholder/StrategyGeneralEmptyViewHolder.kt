package com.ripple.sdk.ui.recyclerview.multitypviewholder

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.lifecycle.ViewModel
import androidx.viewbinding.ViewBinding
import com.ripple.sdk.databinding.ItemGeneralEmptyViewLayoutBinding


/**
 * Author: fanyafeng
 * Date: 2023/2/2 14:04
 * Email: fanyafeng@live.cn
 * Description:
 *///Github See: https://github.com/fanyafeng


class StrategyGeneralEmptyViewHolder<V : ViewModel, D>(val binding: ViewBinding) :
    StrategyBaseBindingViewHolder<V, D>(binding) {

    companion object {
        @JvmOverloads
        @JvmStatic
        fun <V : ViewModel, D> getSample(
            parent: ViewGroup, binding: ViewBinding = ItemGeneralEmptyViewLayoutBinding.inflate(
                LayoutInflater.from(parent.context), parent, false
            )
        ) =
            StrategyGeneralEmptyViewHolder<V, D>(binding)
    }
}