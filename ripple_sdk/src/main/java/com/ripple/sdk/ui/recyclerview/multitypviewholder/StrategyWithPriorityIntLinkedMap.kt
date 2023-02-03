package com.ripple.sdk.ui.recyclerview.multitypviewholder

import androidx.lifecycle.ViewModel
import com.ripple.sdk.ui.recyclerview.multitypviewholder.annotation.ViewHolderIntAnnotation
import com.ripple.sdk.ui.recyclerview.multitypviewholder.annotation.ViewHolderIntGetTypeAnnotation


/**
 * Author: fanyafeng
 * Date: 2022/11/3 15:05
 * Email: fanyafeng@live.cn
 * Description:
 *///Github See: https://github.com/fanyafeng


class StrategyWithPriorityIntLinkedMap<V : ViewModel, D> :
    StrategyWithPriorityLinkedMap<Int, AbsStrategyBaseIntFactory<V, D>>() {

    companion object {
        const val DEFAULT_VALUE = -218
    }

    fun register(clazz: Class<out AbsStrategyBaseIntFactory<V, D>>) {
        val viewHolderIntAnnotation = clazz.getAnnotation(ViewHolderIntAnnotation::class.java)
        viewHolderIntAnnotation?.let { _ ->
            val defaultType = viewHolderIntAnnotation.value
            val instance = clazz.getDeclaredConstructor().newInstance()
            val methods = clazz.declaredMethods
            if (defaultType == DEFAULT_VALUE) {
                methods.forEachIndexed { _, method ->
                    val getTypeMethod =
                        method.getAnnotation(ViewHolderIntGetTypeAnnotation::class.java)
                    getTypeMethod?.let { _ ->
                        val type = method.invoke(instance) as? Int
                        type?.let { _ ->
                            instance?.let {
                                put(it)
                            }
                        }
                    }
                }
            } else {
                instance.setPoolableType(defaultType)
                put(instance)
            }

        }
    }

    fun put(sourceAndTarget: AbsStrategyBaseIntFactory<V, D>) {
        put(sourceAndTarget.getPoolableType(), sourceAndTarget)
    }
}