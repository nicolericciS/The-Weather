package br.com.nicole.clima.Repository

import br.com.nicole.clima.Model.CurrentResponseApi
import br.com.nicole.clima.Model.ForecastResponseApi
import br.com.nicole.clima.Server.ApiServices
import retrofit2.Call

class WeatherRepository(val api: ApiServices) {

    fun getCurrentWeather(lat: Double, lng: Double, unit:String) : Call<CurrentResponseApi> {
        return api.getCurrentWeather(lat, lng, unit, "01dffed027011b1cf421cd7299ce2aa9")
    }

    fun getForecastWeather(lat: Double, lng: Double, unit:String) : Call<ForecastResponseApi> {
        return api.getForecastWeather(lat, lng, unit, "01dffed027011b1cf421cd7299ce2aa9")
    }
}