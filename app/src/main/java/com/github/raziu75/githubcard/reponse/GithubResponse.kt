package com.github.raziu75.githubcard.reponse

import com.google.gson.annotations.SerializedName

data class GithubResponse(
    @SerializedName("login") val userName: String,
    @SerializedName("avatar_url") val avatar: String,
    @SerializedName("followers") val followersCount: Int,
    @SerializedName("following") val followingCount: Int,
    @SerializedName("email") val email: String,
)