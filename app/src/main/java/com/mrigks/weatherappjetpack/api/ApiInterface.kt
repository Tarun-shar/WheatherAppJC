package com.mrigks.weatherappjetpack.api

import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiInterface {
    @GET("v1/current.json")
    suspend fun getWheatherData(
        @Query("key") key: String,
        @Query("q") q: String,
        @Query("aqi") aqi: String = "no"  // default value
    ): Response<WeatherResponse>
}
