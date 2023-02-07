package com.ripple.sdk.demo.main.viewholder

import android.content.Intent
import com.ripple.sdk.demo.databinding.ItemMainButtonLayoutBinding
import com.ripple.sdk.demo.main.*
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

    @ViewHolderIntAnnotation(AbsMainViewHolderFactory.MAIN_BUTTON)
    class Factory :
        AbsMainViewHolderAutoFactory<MainButtonViewHolder, ItemMainButtonLayoutBinding>()
}

