package com.ripple.sdk.ui.recyclerview.multitypviewholder.factory

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.lifecycle.ViewModel
import androidx.viewbinding.ViewBinding
import com.ripple.sdk.ui.recyclerview.multitypviewholder.viewholder.StrategyBaseBindingViewHolder
import com.ripple.sdk.ui.recyclerview.multitypviewholder.StrategyBaseViewHolder
import java.lang.reflect.ParameterizedType
import java.util.concurrent.ConcurrentHashMap


/**
 * Author: fanyafeng
 * Date: 2023/2/3 15:15
 * Email: fanyafeng@live.cn
 * Description:
 *///Github See: https://github.com/fanyafeng


abstract class AbsStrategyBaseIntAutoFactory<VH : StrategyBaseBindingViewHolder<V, D>, VB : ViewBinding, V : ViewModel, D>(
    private val pool: ConcurrentHashMap<Int, StrategyBaseIntFactory<V, D>>
) :
    AbsStrategyBaseIntFactory<V, D>(pool) {

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): StrategyBaseViewHolder<V, D> {
        val genericSuperclass = this@AbsStrategyBaseIntAutoFactory.javaClass.genericSuperclass
        if (genericSuperclass is ParameterizedType) {
            if (genericSuperclass.actualTypeArguments.size >= 2) {
                val viewHolderSonClazz = genericSuperclass.actualTypeArguments[0]
                val viewBindSonClazz = genericSuperclass.actualTypeArguments[1]

                if (viewHolderSonClazz is Class<*> && viewBindSonClazz is Class<*>) {
                    val constructorMethod =
                        viewHolderSonClazz.getDeclaredConstructor(viewBindSonClazz)

                    val method = viewBindSonClazz.getMethod(
                        "inflate",
                        LayoutInflater::class.java,
                        ViewGroup::class.java,
                        Boolean::class.java
                    )

                    val resultBinding =
                        method.invoke(
                            null,
                            LayoutInflater.from(parent.context),
                            parent,
                            false
                        ) as VB
                    return constructorMethod.newInstance(resultBinding) as StrategyBaseViewHolder<V, D>
                }
            }
        }
        throw java.lang.Exception("please check class type is true or not")
    }
}