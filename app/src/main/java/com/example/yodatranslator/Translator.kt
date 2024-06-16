package com.example.yodatranslator

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

private const val translatorUrl = "https://api.funtranslations.com"
val retrofit =
    Retrofit.Builder()
        .baseUrl(translatorUrl)
        .addConverterFactory(GsonConverterFactory.create())
        .build()
