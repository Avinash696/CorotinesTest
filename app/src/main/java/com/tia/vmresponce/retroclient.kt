package com.tia.vmresponce

import retrofit2.converter.gson.GsonConverterFactory

import retrofit2.Retrofit
import okhttp3.OkHttpClient

class retroclient {
    private var retrofit: Retrofit? = null

    fun getClient(): Retrofit? {
//        val interceptor = HttpLoggingInterceptor()
//        interceptor.setLevel(HttpLoggingInterceptor.Level.BODY)
//        val client = OkHttpClient.Builder().addInterceptor(interceptor).build()
        retrofit = Retrofit.Builder()
            .baseUrl("https://reqres.in")
            .addConverterFactory(GsonConverterFactory.create())
//            .client(client)
            .build()
        return retrofit
    }
}