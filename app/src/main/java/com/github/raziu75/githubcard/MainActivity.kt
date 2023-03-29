package com.github.raziu75.githubcard

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.github.raziu75.githubcard.dataService.RetrofitHelper
import com.github.raziu75.githubcard.dataService.UserRepository
import com.github.raziu75.githubcard.model.UserModel

import com.github.raziu75.githubcard.ui.theme.GithubCardTheme


class MainActivity : ComponentActivity() {


    val repository = UserRepository(RetrofitHelper().buildApiService())

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            var user by remember { mutableStateOf<UserModel?>(null) }
            LaunchedEffect(Unit) {
                repository.getUser("McGalanes")
                    .onSuccess {
                        user = it
                        println("User: " + user!!.name)
                    }.onFailure { println("CA MARCHE PAS !") }
            }

          //  MainScreen(model = weather, )
        }
    }
}




@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    GithubCardTheme {

    }
}