package com.ripple.sdk.ui.recyclerview.multitypviewholder.base

import java.util.concurrent.ConcurrentHashMap


/**
 * Author: fanyafeng
 * Date: 2022/10/27 15:47
 * Email: fanyafeng@live.cn
 * Description:
 *///Github See: https://github.com/fanyafeng


interface BaseIntPoolable : Poolable<Int> {

    companion object {
        val pool = ConcurrentHashMap<Int, BaseIntPoolable>()
    }

    override fun getPoolableType() = 0

    override fun getPoolablePriority() = 0
}