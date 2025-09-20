package com.mrigks.weatherappjetpack.Utils

import android.os.Bundle
import androidx.activity.ComponentActivity
import com.mrigks.weatherappjetpack.MVVM.MainRepository
import com.mrigks.weatherappjetpack.MVVM.MainViewModel
import com.mrigks.weatherappjetpack.api.RetrofitInstance

open class BaseActivity: ComponentActivity() {

    protected lateinit var viewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        initViewModel()

    }

    private fun initViewModel() {
        val apiService = RetrofitInstance.weatherApi
        val repository = MainRepository(apiService)
        viewModel = MainViewModel(repository)
    }
}