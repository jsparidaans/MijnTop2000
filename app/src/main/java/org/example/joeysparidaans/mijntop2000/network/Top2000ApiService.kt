package org.example.joeysparidaans.mijntop2000.network

import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.scalars.ScalarsConverterFactory
import retrofit2.http.GET

private const val BASE_URL = "https://www.nporadio2.nl/?option=com_ajax&plugin=Top2000"

private val retrofit = Retrofit.Builder()
    .addConverterFactory(ScalarsConverterFactory.create())
    .baseUrl(BASE_URL)
    .build()

interface Top2000Service {
    @GET("&format=json")
    fun getTop2000():
            Call<String>

    object Top2000Api {
        val retrofitService: Top2000Service by lazy { retrofit.create(Top2000Service::class.java) }
    }
}