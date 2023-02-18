package com.ripple.sdk.ui.recyclerview.multitypviewholder.factory

import android.view.ViewGroup
import androidx.lifecycle.ViewModel
import com.ripple.sdk.ui.recyclerview.multitypviewholder.base.BaseIntPoolable
import com.ripple.sdk.ui.recyclerview.multitypviewholder.viewholder.StrategyBaseBindingViewHolder


/**
 * Author: fanyafeng
 * Date: 2022/11/3 14:51
 * Email: fanyafeng@live.cn
 * Description:
 *///Github See: https://github.com/fanyafeng


interface StrategyBaseIntBindingFactory<V : ViewModel, D> : BaseIntPoolable {
    fun onCreateViewHolder(parent: ViewGroup, viewType: Int): StrategyBaseBindingViewHolder<V, D>
    override fun getPoolablePriority() = 0
}