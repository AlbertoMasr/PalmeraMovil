package com.example.palmera.API

import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class API
{

    companion object
    {

        private var API_SERVICE: APInterface? = null

        fun apiService(): APInterface
        {

            val logging = HttpLoggingInterceptor()
            logging.setLevel(HttpLoggingInterceptor.Level.BODY)

            val httpClient: OkHttpClient.Builder = OkHttpClient.Builder()
            httpClient.addInterceptor(logging)

            val baseUrl = "https://serviciospalmera.azurewebsites.net/api/"

            if (API_SERVICE == null)
            {

                val retrofit: Retrofit = Retrofit.Builder()
                    .baseUrl(baseUrl)
                    .addConverterFactory(GsonConverterFactory.create())
                    .client(httpClient.build())
                    .build()
                API_SERVICE = retrofit.create(APInterface::class.java)

            }

            return API_SERVICE!!

        }

    }

}