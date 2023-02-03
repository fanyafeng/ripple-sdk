package com.ripple.sdk

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.viewbinding.ViewBinding
import com.ripple.sdk.ui.recyclerview.multitypviewholder.AbsStrategyBaseIntAutoFactory
import com.ripple.sdk.ui.recyclerview.multitypviewholder.AbsStrategyBaseIntFactory
import com.ripple.sdk.ui.recyclerview.multitypviewholder.StrategyBaseViewHolder
import java.lang.reflect.ParameterizedType


/**
 * Author: fanyafeng
 * Date: 2023/2/2 13:32
 * Email: fanyafeng@live.cn
 * Description:
 *///Github See: https://github.com/fanyafeng


abstract class AbsMainViewHolderFactory :
    AbsStrategyBaseIntFactory<MainViewModel, IMainModel>(MainActivity.factoryMapPool) {

    companion object {
        const val MAIN_BUTTON = 1
    }
}

abstract class AbsMainViewHolderFactoryAuto<VH : AbsMainBaseBindingViewHolder, VB : ViewBinding> :
    AbsStrategyBaseIntAutoFactory<MainViewModel, IMainModel, VH, VB>(MainActivity.factoryMapPool)