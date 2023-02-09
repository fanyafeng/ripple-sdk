package com.ripple.sdk.demo.main.viewholder

import com.ripple.sdk.demo.BuildConfig
import com.ripple.sdk.demo.databinding.ItemMainTitleLayoutBinding
import com.ripple.sdk.demo.main.*
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