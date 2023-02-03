package com.ripple.sdk.ui.recyclerview.multitypviewholder

import android.view.View
import androidx.lifecycle.ViewModel
import androidx.recyclerview.widget.RecyclerView
import androidx.viewbinding.ViewBinding


/**
 * Author: fanyafeng
 * Date: 2022/11/3 14:50
 * Email: fanyafeng@live.cn
 * Description:
 *///Github See: https://github.com/fanyafeng


abstract class StrategyBaseBindingViewHolder<V : ViewModel, D>(binding: ViewBinding) :
    StrategyBaseViewHolder<V, D>(binding.root)