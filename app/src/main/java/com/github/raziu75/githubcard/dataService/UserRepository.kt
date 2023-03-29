package com.github.raziu75.githubcard.dataService

import com.github.raziu75.githubcard.dataService.mapper.toModel
import com.github.raziu75.githubcard.model.UserModel
import com.github.raziu75.githubcard.reponse.GithubResponse

class UserRepository (private val service: GithubService){

    suspend fun getUser(username: String): Result<UserModel>{
        return service.getUser(username).map { it.toModel()}
    }
}