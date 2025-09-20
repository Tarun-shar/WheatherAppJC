package com.mrigks.weatherappjetpack

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import com.mrigks.weatherappjetpack.Files.WeatherPage
import com.mrigks.weatherappjetpack.Utils.BaseActivity
import com.mrigks.weatherappjetpack.ui.theme.WeatherAppJetpackTheme

class MainActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            WeatherAppJetpackTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    WeatherPage(viewModel)
                }

            }
        }
    }
}
