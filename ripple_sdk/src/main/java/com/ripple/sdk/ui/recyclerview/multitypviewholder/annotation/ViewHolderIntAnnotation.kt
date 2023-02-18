package com.ripple.sdk.ui.recyclerview.multitypviewholder.annotation

import com.ripple.sdk.ui.recyclerview.multitypviewholder.linkmap.StrategyWithPriorityIntLinkedMap.Companion.DEFAULT_VALUE

/**
 * Author: fanyafeng
 * Date: 2022/11/3 15:03
 * Email: fanyafeng@live.cn
 * Description:
 *///Github See: https://github.com/fanyafeng

@Target(AnnotationTarget.CLASS)
@Retention(AnnotationRetention.RUNTIME)
annotation class ViewHolderIntAnnotation(val value: Int = DEFAULT_VALUE)
