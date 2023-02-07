package com.ripple.sdk.demo.main

import android.content.Context
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.ripple.sdk.demo.MainActivity
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
class MainAdapter @Inject constructor(
    @ActivityContext
    private val context: Context
) :
    RecyclerView.Adapter<StrategyBaseViewHolder<MainViewModel, IMainModel>>() {

    var mainModelList: List<IMainModel> = mutableListOf()

    private var factoryMap = MainActivity.factoryMapPool

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): StrategyBaseViewHolder<MainViewModel, IMainModel> {
        return factoryMap[viewType]?.onCreateViewHolder(parent, viewType)
            ?: StrategyGeneralEmptyViewHolder.getSample(parent)
    }

    override fun getItemCount(): Int {
        return mainModelList.size
    }

    override fun onBindViewHolder(
        holder: StrategyBaseViewHolder<MainViewModel, IMainModel>,
        position: Int
    ) {
        val model = mainModelList[position]
        holder.bindData(null, model, position)
    }

    override fun getItemViewType(position: Int): Int {
        return mainModelList[position].getGeneralViewType()
    }
}