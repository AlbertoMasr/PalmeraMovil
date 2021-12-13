package com.example.palmera.API

import com.example.palmera.model.Datil
import retrofit2.Call
import retrofit2.http.GET

interface APInterface
{

    @GET("datiles")
    fun getDatiles(): Call<ArrayList<Datil>>

}