package br.com.nicole.clima.Repository

import br.com.nicole.clima.Server.ApiServices

class CityRepository(val api: ApiServices) {
    fun getCities(q: String, limit: Int) = api.getCitiesList(q, limit, "01dffed027011b1cf421cd7299ce2aa9")
}