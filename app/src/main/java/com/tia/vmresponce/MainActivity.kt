package com.tia.vmresponce

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.tia.vmresponce.Model.VmModel
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        loadData()

    }
    fun loadData(){
         var retrofit: Retrofit? = null
         var m_api:api
        lateinit var retroclient:retroclient

        //get
//
        retrofit = Retrofit.Builder()
            .baseUrl("http://20.198.101.6/connection")
            .addConverterFactory(GsonConverterFactory.create())
//            .client(client)
            .build()


//        m_api= retroclient.getClient()!!.create(api::class.java)
        m_api= retrofit.create(api::class.java)

//
        var call: Call<List<VmModel>> =m_api.getData()
        call.enqueue(object :Callback<List<VmModel>>{
            override fun onResponse(call: Call<List<VmModel>>, response: Response<List<VmModel>>) {
              var data: List<VmModel>? = response.body()
                Log.d("rawat", "onResponse: "+data)
            }

            override fun onFailure(call: Call<List<VmModel>>, t: Throwable) {
            }
        })


    }
}