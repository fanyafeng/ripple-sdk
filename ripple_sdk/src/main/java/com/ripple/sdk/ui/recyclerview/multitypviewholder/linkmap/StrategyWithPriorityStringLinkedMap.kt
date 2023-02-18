package com.ripple.sdk.ui.recyclerview.multitypviewholder.linkmap

import androidx.lifecycle.ViewModel
import com.ripple.sdk.ui.recyclerview.multitypviewholder.annotation.ViewHolderStringAnnotation
import com.ripple.sdk.ui.recyclerview.multitypviewholder.annotation.ViewHolderStringGetTypeAnnotation
import com.ripple.sdk.ui.recyclerview.multitypviewholder.factory.AbsStrategyBaseStringFactory


/**
 * Author: fanyafeng
 * Date: 2022/11/3 15:05
 * Email: fanyafeng@live.cn
 * Description:
 *///Github See: https://github.com/fanyafeng


class StrategyWithPriorityStringLinkedMap<V : ViewModel, D> :
    StrategyWithPriorityLinkedMap<String, AbsStrategyBaseStringFactory<V, D>>() {

    companion object {
        const val DEFAULT_VALUE = ""
    }

    fun register(clazz: Class<out AbsStrategyBaseStringFactory<V, D>>) {
        val viewHolderStringAnnotation = clazz.getAnnotation(ViewHolderStringAnnotation::class.java)
        viewHolderStringAnnotation?.let { _ ->
            val defaultType = viewHolderStringAnnotation.value
            val instance = clazz.getDeclaredConstructor().newInstance()
            val methods = clazz.declaredMethods
            if (defaultType == DEFAULT_VALUE) {
                methods.forEachIndexed { _, method ->
                    val getTypeMethod =
                        method.getAnnotation(ViewHolderStringGetTypeAnnotation::class.java)
                    getTypeMethod?.let { _ ->
                        val type = method.invoke(instance) as? String
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

    fun put(sourceAndTarget: AbsStrategyBaseStringFactory<V, D>) {
        put(sourceAndTarget.getPoolableType(), sourceAndTarget)
    }
}