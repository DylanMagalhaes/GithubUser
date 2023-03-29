package com.github.raziu75.githubcard.dataService

import com.github.raziu75.githubcard.dataService.adapter.ResultCallAdapterFactory
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class RetrofitHelper {
    private val baseUrl = "https://github.com"

    private val retrofit = Retrofit.Builder()
        .baseUrl(baseUrl)
        .addConverterFactory(GsonConverterFactory.create()) // utiliser Gson pour la conversion
        .addCallAdapterFactory(ResultCallAdapterFactory()) // utiliser Result
        .build()


    fun buildApiService(): GithubService {
        return retrofit.create(GithubService::class.java)
    }
}