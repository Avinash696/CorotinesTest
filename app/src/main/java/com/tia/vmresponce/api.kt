package com.tia.vmresponce

import com.tia.vmresponce.Model.VmModel
import retrofit2.Call
import retrofit2.http.GET

interface api {
    @GET("ct.php")
    fun getData(): Call<List<VmModel>>
}