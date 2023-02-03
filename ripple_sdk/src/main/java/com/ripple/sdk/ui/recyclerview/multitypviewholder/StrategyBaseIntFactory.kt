package com.ripple.sdk.ui.recyclerview.multitypviewholder

import android.view.ViewGroup
import androidx.lifecycle.ViewModel


/**
 * Author: fanyafeng
 * Date: 2022/11/3 14:51
 * Email: fanyafeng@live.cn
 * Description:
 *///Github See: https://github.com/fanyafeng


interface StrategyBaseIntFactory<V : ViewModel, D> : BaseIntPoolable {
    fun onCreateViewHolder(parent: ViewGroup, viewType: Int): StrategyBaseViewHolder<V, D>
    override fun getPoolablePriority() = 0
}