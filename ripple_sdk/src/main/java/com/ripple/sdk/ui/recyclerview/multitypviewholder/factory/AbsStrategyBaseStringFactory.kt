package com.ripple.sdk.ui.recyclerview.multitypviewholder.factory

import androidx.lifecycle.ViewModel
import java.util.concurrent.ConcurrentHashMap


/**
 * Author: fanyafeng
 * Date: 2022/11/3 14:58
 * Email: fanyafeng@live.cn
 * Description:
 *///Github See: https://github.com/fanyafeng


abstract class AbsStrategyBaseStringFactory<V : ViewModel, D>(private val pool: ConcurrentHashMap<String, StrategyBaseStringFactory<V, D>>) :
    StrategyBaseStringFactory<V, D> {

    private var type: String? = null

    fun setPoolableType(type: String) {
        this.type = type
    }


    override fun getPoolableType(): String {
        return if (type.isNullOrEmpty()) super.getPoolableType() else type!!
    }


    override fun offer() {
        pool[getPoolableType()] = this
    }
}