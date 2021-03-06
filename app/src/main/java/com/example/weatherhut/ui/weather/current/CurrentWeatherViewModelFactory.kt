package com.example.weatherhut.ui.weather.current

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.weatherhut.data.provider.LocationSettingProvider
import com.example.weatherhut.data.provider.UnitProvider
import com.example.weatherhut.data.repository.WeatherHutRepository

class CurrentWeatherViewModelFactory(
    private val weatherHutRepository: WeatherHutRepository,
    private val unitProvider: UnitProvider,
    private val locationSettingProvider: LocationSettingProvider
    ): ViewModelProvider.NewInstanceFactory(){
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return CurrentWeatherViewModel(weatherHutRepository, unitProvider, locationSettingProvider) as T
    }
}