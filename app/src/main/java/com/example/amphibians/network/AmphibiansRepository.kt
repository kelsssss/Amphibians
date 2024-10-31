package com.example.amphibians.network

import com.example.amphibians.ui.model.Amphibian

class AmphibiansRepository(
    val amphibiansService: AmphibiansApiService
) {

//    var localData = AmphibiansApi.retrofitService.getAllData()
//    private val AmphibianService = AmphibiansApi.retrofitService

    suspend fun getData() : List<Amphibian>{
        return amphibiansService.getAllData()
    }
}