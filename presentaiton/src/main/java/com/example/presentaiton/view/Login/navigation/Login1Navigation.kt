package com.example.presentation.view.Login1.navigation

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavOptions
import androidx.navigation.compose.composable
import com.example.presentaiton.view.Login.screen.LoginAoute

const val loginAoute = "login_Aoute"

fun NavController.navigateToLogin(navOptions: NavOptions? = null) {
    this.navigate(loginAoute, navOptions)
}

fun NavGraphBuilder.loginScreen(
    onInputLoginClick: () -> Unit,
) {
    composable(route = loginAoute) {
        LoginAoute(onInputLoginClick = onInputLoginClick)
    }
}
