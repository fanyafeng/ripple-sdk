package com.ripple.sdk.demo.main

import androidx.viewbinding.ViewBinding
import com.ripple.sdk.demo.MainActivity
import com.ripple.sdk.ui.recyclerview.multitypviewholder.factory.AbsStrategyBaseIntAutoFactory
import com.ripple.sdk.ui.recyclerview.multitypviewholder.factory.AbsStrategyBaseIntBindingAutoFactory
import com.ripple.sdk.ui.recyclerview.multitypviewholder.factory.AbsStrategyBaseIntFactory


/**
 * Author: fanyafeng
 * Date: 2023/2/2 13:32
 * Email: fanyafeng@live.cn
 * Description:
 *///Github See: https://github.com/fanyafeng


abstract class AbsMainViewHolderFactory :
    AbsStrategyBaseIntFactory<MainViewModel, IMainModel>(MainActivity.factoryMapPool) {

    companion object {
        const val TITLE = 0
        const val MAIN_BUTTON = 1
    }
}

abstract class AbsMainViewHolderAutoFactory<VH : AbsMainBaseBindingViewHolder, VB : ViewBinding> :
    AbsStrategyBaseIntAutoFactory<VH, VB, MainViewModel, IMainModel>(MainActivity.factoryMapPool)

abstract class AbsMainBindingViewHolderAutoFactory<VH : AbsMainBaseBindingViewHolder, VB : ViewBinding> :
    AbsStrategyBaseIntBindingAutoFactory<VH, VB, MainViewModel, IMainModel>(MainActivity.factoryBindingMapPool)