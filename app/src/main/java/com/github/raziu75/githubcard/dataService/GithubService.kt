package com.github.raziu75.githubcard.dataService

import com.github.raziu75.githubcard.model.UserModel
import com.github.raziu75.githubcard.reponse.GithubResponse
import retrofit2.Retrofit
import retrofit2.converter.scalars.ScalarsConverterFactory
import retrofit2.http.GET
import retrofit2.http.Path


//Interface d'appel
interface GithubService {

    @GET("/{username}")
   suspend fun getUser(@Path("username") username:String ): Result<GithubResponse>

}

