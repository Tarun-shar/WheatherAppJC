package com.mrigks.weatherappjetpack.api

import com.mrigks.weatherappjetpack.Utils.Constants
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitInstance {
    private fun getInstance(): Retrofit {
        return Retrofit.Builder()
            .baseUrl(Constants.BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    val weatherApi: ApiInterface = getInstance().create(ApiInterface::class.java)
}
