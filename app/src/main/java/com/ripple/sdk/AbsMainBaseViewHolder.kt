package com.ripple.sdk

import android.view.View
import androidx.viewbinding.ViewBinding
import com.ripple.sdk.ui.recyclerview.multitypviewholder.StrategyBaseBindingViewHolder
import com.ripple.sdk.ui.recyclerview.multitypviewholder.StrategyBaseViewHolder


/**
 * Author: fanyafeng
 * Date: 2023/2/2 13:28
 * Email: fanyafeng@live.cn
 * Description:
 *///Github See: https://github.com/fanyafeng


abstract class AbsMainBaseViewHolder(view: View) :
    StrategyBaseViewHolder<MainViewModel, IMainModel>(view)

abstract class AbsMainBaseBindingViewHolder(binding: ViewBinding) :
    StrategyBaseBindingViewHolder<MainViewModel, IMainModel>(binding)