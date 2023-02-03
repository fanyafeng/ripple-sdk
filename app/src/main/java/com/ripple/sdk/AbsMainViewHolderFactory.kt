package com.ripple.sdk

import com.ripple.sdk.ui.recyclerview.multitypviewholder.AbsStrategyBaseIntFactory


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