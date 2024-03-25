package br.com.nicole.clima.ViewModel

import androidx.lifecycle.ViewModel
import br.com.nicole.clima.Model.CityResponseApi
import br.com.nicole.clima.Repository.CityRepository
import br.com.nicole.clima.Server.ApiClient
import br.com.nicole.clima.Server.ApiServices
import retrofit2.Call

class CityViewModel(val repository: CityRepository) : ViewModel() {
    constructor() : this(CityRepository(ApiClient().getClient().create(ApiServices::class.java)))

    fun loadCity(q: String, limit: Int) : Call<CityResponseApi>{
        return repository.getCities(q, limit)
    }

}