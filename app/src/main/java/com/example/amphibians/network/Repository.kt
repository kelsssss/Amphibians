package com.example.amphibians.network

import com.example.amphibians.ui.model.Amphibian

object Repository {
//    var localData = AmphibiansApi.retrofitService.getAllData()
    private val AmphibianService = AmphibiansApi.retrofitService

    suspend fun getData() : List<Amphibian>{
        return AmphibianService.getAllData()
    }
}