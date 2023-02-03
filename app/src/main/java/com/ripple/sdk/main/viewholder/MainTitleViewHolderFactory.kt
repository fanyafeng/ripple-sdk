package com.ripple.sdk.main.viewholder

import com.ripple.sdk.databinding.ItemMainTitleLayoutBinding
import com.ripple.sdk.main.*
import com.ripple.sdk.ui.recyclerview.multitypviewholder.annotation.ViewHolderIntAnnotation


/**
 * Author: fanyafeng
 * Date: 2023/2/3 15:47
 * Email: fanyafeng@live.cn
 * Description:
 *///Github See: https://github.com/fanyafeng


class MainTitleViewHolder(private val binding: ItemMainTitleLayoutBinding) :
    AbsMainBaseBindingViewHolder(binding) {
    override fun bindData(viewModel: MainViewModel?, dataSource: IMainModel?, position: Int) {
        super.bindData(viewModel, dataSource, position)
        dataSource?.run {
            getGeneralTitle()?.let {
                binding.title.text = it
            }
        }
    }

    @ViewHolderIntAnnotation(AbsMainViewHolderFactory.TITLE)
    class Factory :
        AbsMainViewHolderAutoFactory<MainTitleViewHolder, ItemMainTitleLayoutBinding>()
}