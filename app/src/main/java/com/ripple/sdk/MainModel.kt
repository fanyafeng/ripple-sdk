package com.ripple.sdk

import com.ripple.sdk.ui.recyclerview.multitypviewholder.StrategyWithPriorityIntLinkedMap
import javax.inject.Inject


/**
 * Author: fanyafeng
 * Date: 2023/2/2 13:28
 * Email: fanyafeng@live.cn
 * Description:
 *///Github See: https://github.com/fanyafeng


data class MainModel constructor(
    var type: Int = StrategyWithPriorityIntLinkedMap.DEFAULT_VALUE,
    var title: String? = null,
    var clazz: Class<*>? = null,
) : java.io.Serializable, IMainModel {

    @Inject
    constructor() : this(StrategyWithPriorityIntLinkedMap.DEFAULT_VALUE, null, null)

    override fun getGeneralViewType() = type

    override fun getGeneralTitle() = title
    override fun getGeneralActionClazz(): Class<*>? = clazz
}