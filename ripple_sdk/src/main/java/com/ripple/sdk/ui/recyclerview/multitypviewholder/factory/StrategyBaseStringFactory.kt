package com.ripple.sdk.ui.recyclerview.multitypviewholder.factory

import android.view.ViewGroup
import androidx.lifecycle.ViewModel
import com.ripple.sdk.ui.recyclerview.multitypviewholder.StrategyBaseViewHolder
import com.ripple.sdk.ui.recyclerview.multitypviewholder.base.BaseStringPoolable


/**
 * Author: fanyafeng
 * Date: 2022/11/3 14:51
 * Email: fanyafeng@live.cn
 * Description:
 *///Github See: https://github.com/fanyafeng


interface StrategyBaseStringFactory<V : ViewModel, D> : BaseStringPoolable {
    fun onCreateViewHolder(parent: ViewGroup, viewType: Int): StrategyBaseViewHolder<V, D>
    override fun getPoolablePriority() = 0
}