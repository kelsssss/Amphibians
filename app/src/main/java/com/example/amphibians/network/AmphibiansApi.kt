package com.example.amphibians.network

import com.example.amphibians.ui.model.Amphibian
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET


const val BASE_URL = "https://android-kotlin-fun-mars-server.appspot.com/"

var retrofit = Retrofit.Builder()
    .baseUrl(BASE_URL)
    .addConverterFactory(GsonConverterFactory.create())
    .build()


interface AmphibiansApi{
    @GET("amphibians")
    fun getAllData() : List<Amphibian>
}


fun AmphibiansApiService(){
    retrofit.create(AmphibiansApi::class.java)
}

