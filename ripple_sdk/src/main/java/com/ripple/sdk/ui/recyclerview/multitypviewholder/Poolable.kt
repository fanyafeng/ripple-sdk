package com.ripple.sdk.ui.recyclerview.multitypviewholder

import java.io.Serializable


/**
 * Author: fanyafeng
 * Date: 2022/10/27 15:45
 * Email: fanyafeng@live.cn
 * Description:
 *///Github See: https://github.com/fanyafeng


interface Poolable<K> : Serializable {
    fun offer()
    fun getPoolableType(): K
    fun getPoolablePriority(): Int = 0
}