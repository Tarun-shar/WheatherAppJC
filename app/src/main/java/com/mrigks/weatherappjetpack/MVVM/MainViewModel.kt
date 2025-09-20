package com.mrigks.weatherappjetpack.MVVM

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch

class MainViewModel(val repository: MainRepository) : ViewModel() {

    val state = WeatherState()

    fun getData(city: String) {
        if (city.isBlank()) {   // ✅ Prevent empty search
            state.error.value = "Please enter a city name"
            return
        }

        state.loader.value = true
        state.error.value = "" // clear old error
        state.weatherAPiResponse.value = null // clear old data

        viewModelScope.launch {
            try {
                val response = repository.getWeatherApiData(city)
                if (response.isSuccessful) {
                    response.body()?.let {
                        state.weatherAPiResponse.value = it   // ✅ update UI
                    } ?: run {
                        state.error.value = "Empty response body"
                    }
                } else {
                    state.error.value = "Error: ${response.code()} ${response.message()}"
                }
            } catch (e: Exception) {
                state.error.value = "Exception: ${e.localizedMessage}"
            } finally {
                state.loader.value = false
            }
        }
    }
}
