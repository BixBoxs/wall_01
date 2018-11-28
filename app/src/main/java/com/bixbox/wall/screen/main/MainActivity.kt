package com.bixbox.wall.screen.main

import androidx.lifecycle.ViewModelProviders
import com.bixbox.wall.R
import com.bixbox.wall.data.model.BaseActivity
import com.bixbox.wall.databinding.ActivityMainBinding

class MainActivity :
        BaseActivity<ActivityMainBinding, MainActivityViewModel>() {

    override fun getLayoutRes(): Int = R.layout.activity_main

    override fun initView() {
        viewModel = ViewModelProviders.of(this).get(MainActivityViewModel::class.java)
        binding.viewModel = viewModel
    }
}
