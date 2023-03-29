package com.github.raziu75.githubcard.ui.composable

import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable

@Composable
fun AppScaffold() {
    Scaffold(
        topBar = { AppBar() },
        content = { }
    )
}