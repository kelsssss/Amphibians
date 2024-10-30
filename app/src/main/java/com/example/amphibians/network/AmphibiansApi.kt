package com.example.amphibians.network

import com.example.amphibians.ui.model.Amphibian
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET


const val BASE_URL = "https://android-kotlin-fun-mars-server.appspot.com"

var retrofit = Retrofit.Builder()
    .baseUrl(BASE_URL)
    .addConverterFactory(GsonConverterFactory.create())
    .build()



interface AmphibiansApiService{
    @GET("/amphibians")
    fun getAllData() : List<Amphibian>
}


object AmphibiansApi{
    val retrofitService : AmphibiansApiService by lazy {
        retrofit.create(AmphibiansApiService::class.java)
    }
}

