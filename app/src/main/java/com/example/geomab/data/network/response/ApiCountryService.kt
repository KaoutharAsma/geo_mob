package com.example.geomab.data.network.response

import com.example.geomab.data.network.ConectivityInterceptor
import com.jakewharton.retrofit2.adapter.kotlin.coroutines.CoroutineCallAdapterFactory
import kotlinx.coroutines.Deferred
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiCountryService {
    @GET("countries/")
    fun getContries(

    ): Deferred<CountryResponse>

    @GET("slideshowImages/")
    fun getSlideShowImages(
        @Query("country") country_id: Int
    ): Deferred<SlideShowImages>
    companion object{
        operator fun invoke(conectivityInterceptor: ConectivityInterceptor): ApiCountryService {

            val okHttpClient = OkHttpClient.Builder()
                .addInterceptor(conectivityInterceptor)
                .build()
            return Retrofit.Builder()
                .client(okHttpClient)
                .baseUrl("http://geo-mob-2cs.herokuapp.com/")
                .addCallAdapterFactory(CoroutineCallAdapterFactory())
                .addConverterFactory(GsonConverterFactory.create())
                .build()
                .create(ApiCountryService::class.java)
        }
    }
}