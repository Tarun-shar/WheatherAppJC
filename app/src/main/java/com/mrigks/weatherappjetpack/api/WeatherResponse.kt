package com.mrigks.weatherappjetpack.api

data class WeatherResponse(
    val location: Location,
    val current: Current
) {
    data class Location(
        val name: String,
        val region: String,
        val country: String,
        val lat: String,
        val lon: String,
        val tz_id: String,
        val localtime_epoch: String,
        val localtime: String
    )

    data class Current(
        val last_updated_epoch: String,
        val last_updated: String,
        val temp_c: String,
        val temp_f: String,
        val is_day: String,
        val condition: Condition,
        val wind_mph: String,
        val wind_kph: String,
        val wind_degree: String,
        val wind_dir: String,
        val pressure_mb: String,
        val pressure_in: String,
        val precip_mm: String,
        val precip_in: String,
        val humidity: String,
        val cloud: String,
        val feelslike_c: String,
        val feelslike_f: String,
        val windchill_c: String,
        val windchill_f: String,
        val heatindex_c: String,
        val heatindex_f: String,
        val dewpoString_c: String,
        val dewpoString_f: String,
        val vis_km: String,
        val vis_miles: String,
        val uv: String,
        val gust_mph: String,
        val gust_kph: String,
        val short_rad: String,
        val diff_rad: String,
        val dni: String,
        val gti: String
    )

    data class Condition(
        val text: String,
        val icon: String,
        val code: String
    )
}
