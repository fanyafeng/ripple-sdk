package com.ripple.sdk.ui.recyclerview.multitypviewholder.factory

import androidx.lifecycle.ViewModel
import java.util.concurrent.ConcurrentHashMap


/**
 * Author: fanyafeng
 * Date: 2022/11/3 14:58
 * Email: fanyafeng@live.cn
 * Description:
 *///Github See: https://github.com/fanyafeng


abstract class AbsStrategyBaseIntBindingFactory<V : ViewModel, D>(private val pool: ConcurrentHashMap<Int, StrategyBaseIntBindingFactory<V, D>>) :
    StrategyBaseIntBindingFactory<V, D> {

    private var type: Int? = null

    fun setPoolableType(type: Int) {
        this.type = type
    }

    override fun getPoolableType(): Int {
        return type ?: super.getPoolableType()
    }

    override fun offer() {
        pool[getPoolableType()] = this
    }
}