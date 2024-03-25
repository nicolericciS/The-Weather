package br.com.nicole.clima.ViewModel

import androidx.lifecycle.ViewModel
import br.com.nicole.clima.Model.CurrentResponseApi
import br.com.nicole.clima.Model.ForecastResponseApi
import br.com.nicole.clima.Repository.WeatherRepository
import br.com.nicole.clima.Server.ApiClient
import br.com.nicole.clima.Server.ApiServices
import retrofit2.Call

class WeatherViewModel(val repository: WeatherRepository) : ViewModel() {

    constructor() : this(WeatherRepository(ApiClient().getClient().create(ApiServices::class.java)))

    fun loadCurrentWeather(lat: Double, lng: Double, unit: String) : Call<CurrentResponseApi> {
        return repository.getCurrentWeather(lat, lng, unit)

    }

    fun loadForecastWeather(lat: Double, lng: Double, unit: String) : Call<ForecastResponseApi> {
        return repository.getForecastWeather(lat, lng, unit)

    }
}