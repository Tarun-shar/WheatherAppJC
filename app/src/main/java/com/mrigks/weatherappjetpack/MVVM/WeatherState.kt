package com.mrigks.weatherappjetpack.MVVM

import androidx.compose.runtime.mutableStateOf
import com.mrigks.weatherappjetpack.api.WeatherResponse

class WeatherState {
    val loader = mutableStateOf(false) // default: not loading
    val weatherAPiResponse = mutableStateOf<WeatherResponse?>(null) // default: no data
    val error = mutableStateOf("") // default: no error
}



