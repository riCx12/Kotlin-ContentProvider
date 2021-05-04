package com.ricx12.applicationworkapi.api

import android.telecom.Call
import com.ricx12.applicationworkapi.model.Product
import retrofit2.http.GET

interface ProductApi {
    @GET("getdata.php")
    fun getProductApi(): Call<List<Product>>
}