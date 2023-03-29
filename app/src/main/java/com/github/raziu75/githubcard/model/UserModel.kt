package com.github.raziu75.githubcard.model

data class UserModel(
    val name: String,
    val followers: Int,
    val following: Int,
    val avatar: String,
    val email: String
)