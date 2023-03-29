package com.github.raziu75.githubcard.dataService.mapper

import com.github.raziu75.githubcard.model.UserModel
import com.github.raziu75.githubcard.reponse.GithubResponse

fun GithubResponse.toModel(): UserModel {
    val userInfo = this
return UserModel(

    name = userInfo.userName,
    avatar = userInfo.avatar,
    email = userInfo.email,
    followers = userInfo.followersCount,
    following = userInfo.followingCount,
)
}