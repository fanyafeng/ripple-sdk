package com.ripple.sdk.demo.main.adapter

import android.content.Context
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.ripple.sdk.demo.MainActivity
import com.ripple.sdk.demo.main.IMainModel
import com.ripple.sdk.demo.main.MainViewModel
import com.ripple.sdk.ui.recyclerview.multitypviewholder.viewholder.StrategyBaseBindingViewHolder
import com.ripple.sdk.ui.recyclerview.multitypviewholder.StrategyBaseViewHolder
import com.ripple.sdk.ui.recyclerview.multitypviewholder.StrategyGeneralEmptyViewHolder
import dagger.hilt.android.qualifiers.ActivityContext
import dagger.hilt.android.scopes.ActivityScoped
import javax.inject.Inject


/**
 * Author: fanyafeng
 * Date: 2023/2/2 13:26
 * Email: fanyafeng@live.cn
 * Description:
 *///Github See: https://github.com/fanyafeng

@ActivityScoped
class MainBindingAdapter @Inject constructor(
    @ActivityContext
    private val context: Context
) :
    RecyclerView.Adapter<StrategyBaseBindingViewHolder<MainViewModel, IMainModel>>() {

    var mainModelList: List<IMainModel> = mutableListOf()

    private var factoryMap = MainActivity.factoryBindingMapPool


    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): StrategyBaseBindingViewHolder<MainViewModel, IMainModel> {
        return factoryMap[viewType]?.onCreateViewHolder(parent, viewType)
            ?: StrategyGeneralEmptyViewHolder.getSample(parent)
    }


    override fun onBindViewHolder(
        holder: StrategyBaseBindingViewHolder<MainViewModel, IMainModel>,
        position: Int
    ) {
        val model = mainModelList[position]
        holder.bindData(null, model, position)
    }

    override fun getItemCount(): Int {
        return mainModelList.size
    }

    override fun onViewAttachedToWindow(holder: StrategyBaseBindingViewHolder<MainViewModel, IMainModel>) {
        holder.onViewAttachedToWindow(holder)
    }


    override fun getItemViewType(position: Int): Int {
        return mainModelList[position].getGeneralViewType()
    }
}