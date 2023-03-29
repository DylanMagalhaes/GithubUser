package com.github.raziu75.githubcard.ui.composable

import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable

@Composable
fun AppBar() {
    TopAppBar(title = { Text(text = "Profil GitHub")})
}