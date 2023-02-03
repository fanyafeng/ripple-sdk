package com.ripple.sdk.ui.recyclerview.multitypviewholder

import java.util.concurrent.ConcurrentHashMap


/**
 * Author: fanyafeng
 * Date: 2022/10/27 15:47
 * Email: fanyafeng@live.cn
 * Description:
 *///Github See: https://github.com/fanyafeng


interface BaseStringPoolable : Poolable<String> {

    companion object {
        val pool = ConcurrentHashMap<Int, BaseStringPoolable>()
    }

    override fun getPoolableType() = ""

    override fun getPoolablePriority() = 0
}