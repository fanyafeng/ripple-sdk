package com.ripple.sdk.demo.main


/**
 * Author: fanyafeng
 * Date: 2023/2/2 13:55
 * Email: fanyafeng@live.cn
 * Description:
 *///Github See: https://github.com/fanyafeng


sealed interface IMainModel {

    fun getGeneralViewType(): Int

    fun getGeneralTitle(): String?

    fun getGeneralActionClazz(): Class<*>?
}