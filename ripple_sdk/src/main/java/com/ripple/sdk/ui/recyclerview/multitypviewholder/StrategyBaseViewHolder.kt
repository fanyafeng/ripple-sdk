package com.ripple.sdk.ui.recyclerview.multitypviewholder

import android.view.View
import androidx.lifecycle.ViewModel
import androidx.recyclerview.widget.RecyclerView


/**
 * Author: fanyafeng
 * Date: 2022/11/3 14:50
 * Email: fanyafeng@live.cn
 * Description:
 *///Github See: https://github.com/fanyafeng


abstract class StrategyBaseViewHolder<V : ViewModel, D>(view: View) :
    RecyclerView.ViewHolder(view) {
    var floorPosition: Int = 0
        private set

    open fun bindData(viewModel: V?, dataSource: D?, position: Int) {
        floorPosition = position
    }

    open fun onViewAttachedToWindow(holder: StrategyBaseViewHolder<V, D>) {

    }
}