package com.bixbox.wall.data.model

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding

abstract class BaseActivity<ViewBinding : ViewDataBinding, ViewModel : BaseViewModel> :
        AppCompatActivity() {

    lateinit var binding: ViewBinding
    lateinit var viewModel: ViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, getLayoutRes())
        binding.setLifecycleOwner(this)
        initView()
    }

    protected abstract fun getLayoutRes(): Int

    protected abstract fun initView()
}
