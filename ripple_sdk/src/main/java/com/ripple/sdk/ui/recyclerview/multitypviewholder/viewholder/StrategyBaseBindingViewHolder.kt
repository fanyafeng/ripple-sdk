package com.ripple.sdk.ui.recyclerview.multitypviewholder.viewholder

import android.content.Context
import androidx.lifecycle.ViewModel
import androidx.viewbinding.ViewBinding
import com.ripple.sdk.ui.recyclerview.multitypviewholder.StrategyBaseViewHolder


/**
 * Author: fanyafeng
 * Date: 2022/11/3 14:50
 * Email: fanyafeng@live.cn
 * Description:
 *///Github See: https://github.com/fanyafeng


abstract class StrategyBaseBindingViewHolder<V : ViewModel, D>(binding: ViewBinding) :
    StrategyBaseViewHolder<V, D>(binding.root) {
    protected val mContext: Context? = binding.root.context
}