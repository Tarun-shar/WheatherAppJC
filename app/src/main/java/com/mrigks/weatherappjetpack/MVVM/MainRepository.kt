package com.mrigks.weatherappjetpack.MVVM

import com.mrigks.weatherappjetpack.Utils.Constants
import com.mrigks.weatherappjetpack.api.ApiInterface
import com.mrigks.weatherappjetpack.api.WeatherResponse
import retrofit2.Response

class MainRepository(private val apiServices: ApiInterface) {
    suspend fun getWeatherApiData(city: String): Response<WeatherResponse> {
        return apiServices.getWheatherData(Constants.API_KEY, city)
    }
}
