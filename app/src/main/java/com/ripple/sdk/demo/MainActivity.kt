package com.ripple.sdk.demo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import com.ripple.sdk.binding.inflate
import com.ripple.sdk.demo.databinding.ActivityMainBinding
import com.ripple.sdk.demo.main.*
import com.ripple.sdk.demo.main.adapter.MainAdapter
import com.ripple.sdk.demo.main.adapter.MainBindingAdapter
import com.ripple.sdk.demo.main.viewholder.MainButtonBindingViewHolder
import com.ripple.sdk.demo.main.viewholder.MainButtonViewHolder
import com.ripple.sdk.demo.main.viewholder.MainTitleViewHolder
import com.ripple.sdk.ui.recyclerview.multitypviewholder.factory.StrategyBaseIntBindingFactory
import com.ripple.sdk.ui.recyclerview.multitypviewholder.factory.StrategyBaseIntFactory
import com.ripple.sdk.ui.recyclerview.multitypviewholder.linkmap.StrategyWithPriorityIntBindingLinkedMap
import com.ripple.sdk.ui.recyclerview.multitypviewholder.linkmap.StrategyWithPriorityIntLinkedMap
import dagger.hilt.android.AndroidEntryPoint
import java.util.concurrent.ConcurrentHashMap
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    companion object {
        val factoryMapPool =
            ConcurrentHashMap<Int, StrategyBaseIntFactory<MainViewModel, IMainModel>>()

        val factoryBindingMapPool =
            ConcurrentHashMap<Int, StrategyBaseIntBindingFactory<MainViewModel, IMainModel>>()
    }

    private val binding: ActivityMainBinding by inflate()
    private val viewModel by viewModels<MainViewModel>()

    @Inject
    lateinit var mainModel: MainModel

    @Inject
//    lateinit var mainAdapter: MainAdapter
    lateinit var mainAdapter: MainBindingAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding.test.text = "测试"

        initView()
        initData()
    }

    private fun initView() {
        mainModel?.type?.let {
            binding.test.text = "测试" + it
        }


    }

    private fun initData() {
//        StrategyWithPriorityIntLinkedMap<MainViewModel, IMainModel>().apply {
//            register(MainButtonViewHolder.Factory::class.java)
//            register(MainTitleViewHolder.Factory::class.java)
//        }

        StrategyWithPriorityIntBindingLinkedMap<MainViewModel, IMainModel>().apply {
            register(MainButtonBindingViewHolder.Factory::class.java)
        }

        binding.test.text = viewModel.str

        val list =
            mutableListOf(
                MainModel(
                    type = AbsMainViewHolderFactory.TITLE,
                    title = "RecyclerView相关"
                ),
                MainModel(
                    type = AbsMainViewHolderFactory.MAIN_BUTTON,
                    title = "测试多类型viewHolder",
                    clazz = MainActivity::class.java
                )
            )
        binding.mainRV.adapter = mainAdapter
        mainAdapter.mainModelList = list
        mainAdapter.notifyDataSetChanged()

        binding.test.setOnClickListener {


        }
    }


}