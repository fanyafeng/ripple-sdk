package com.ripple.sdk.main

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject


/**
 * Author: fanyafeng
 * Date: 2023/2/2 11:01
 * Email: fanyafeng@live.cn
 * Description:
 *///Github See: https://github.com/fanyafeng

@HiltViewModel
class MainViewModel @Inject constructor() : ViewModel() {
    var str = "我是viewModel"
}