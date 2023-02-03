package com.ripple.sdk.main

import androidx.viewbinding.ViewBinding
import com.ripple.sdk.MainActivity
import com.ripple.sdk.ui.recyclerview.multitypviewholder.AbsStrategyBaseIntAutoFactory
import com.ripple.sdk.ui.recyclerview.multitypviewholder.AbsStrategyBaseIntFactory


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