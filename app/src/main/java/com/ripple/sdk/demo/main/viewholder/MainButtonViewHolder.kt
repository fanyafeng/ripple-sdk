package com.ripple.sdk.demo.main.viewholder

import android.content.Intent
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.ripple.sdk.demo.databinding.ItemMainButtonLayoutBinding
import com.ripple.sdk.demo.main.*
import com.ripple.sdk.ui.recyclerview.multitypviewholder.StrategyBaseViewHolder
import com.ripple.sdk.ui.recyclerview.multitypviewholder.annotation.ViewHolderIntAnnotation


/**
 * Author: fanyafeng
 * Date: 2023/2/2 13:46
 * Email: fanyafeng@live.cn
 * Description:
 *///Github See: https://github.com/fanyafeng


class MainButtonViewHolder(private val binding: ItemMainButtonLayoutBinding) :
    AbsMainBaseBindingViewHolder(binding) {

    override fun bindData(viewModel: MainViewModel?, dataSource: IMainModel?, position: Int) {
        super.bindData(viewModel, dataSource, position)
        val context = binding.root.context
        dataSource?.run {
            getGeneralTitle()?.let {
                binding.button.text = it
            }

            binding.button.setOnClickListener { _ ->
                getGeneralActionClazz()?.let {
                    context.startActivity(Intent(context, it))
                }
            }
        }
    }

    override fun onViewAttachedToWindow(holder: StrategyBaseViewHolder<MainViewModel, IMainModel>) {
        super.onViewAttachedToWindow(holder)
        if (itemViewType == 666) {
            val params = holder.itemView.layoutParams
            if (params is StaggeredGridLayoutManager.LayoutParams) {
                params.isFullSpan = true
            }
        }
    }

    @ViewHolderIntAnnotation(AbsMainViewHolderFactory.MAIN_BUTTON)
    class Factory :
        AbsMainViewHolderAutoFactory<MainButtonViewHolder, ItemMainButtonLayoutBinding>()
}

