package com.example.amphibians.network

class Repository {
    val localData = AmphibiansApi.retrofitService.getAllData()
}