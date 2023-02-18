package com.ripple.sdk.ui.recyclerview.multitypviewholder.linkmap

import com.ripple.sdk.ui.recyclerview.multitypviewholder.base.Poolable
import java.util.concurrent.ConcurrentHashMap


/**
 * Author: fanyafeng
 * Date: 2022/10/27 15:45
 * Email: fanyafeng@live.cn
 * Description:
 *///Github See: https://github.com/fanyafeng


open class StrategyWithPriorityLinkedMap<K, V : Poolable<K>> {
    private val keyToEntry: ConcurrentHashMap<K, HashSet<V>> =
        ConcurrentHashMap()

    fun put(key: K, value: V) {
        key?.let {
            var entry: HashSet<V>? = keyToEntry[key]
            if (entry == null) {
                entry = hashSetOf()
                keyToEntry[key] = entry
            }
            value.offer()
            entry.add(value)
        }
    }

    fun get(key: K): V? {
        return key?.let {
            val entry = keyToEntry[key]
            return entry?.maxByOrNull { it.getPoolablePriority() }?.apply { offer() }
        }
    }

    fun getListWithOrder(key: K): List<V?>? {
        return getSet(key)?.sortedBy { it?.getPoolablePriority() }
    }

    fun getSet(key: K): Set<V?>? {
        return key?.let {
            return keyToEntry[key]
        }
    }

    fun getAll(): ConcurrentHashMap<K, HashSet<V>> {
        return keyToEntry
    }

    override fun toString(): String {
        return "StrategyWithPriorityLinkedMap(keyToEntry=$keyToEntry)"
    }
}