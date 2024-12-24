package com.example.presentation.view.Login1.navigation

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavOptions
import androidx.navigation.compose.composable
import com.example.presentaiton.view.Login.screen.Login1

const val loginRoute = "login_route"

fun NavController.navigateToLogin(navOptions: NavOptions? = null) {
    this.navigate(loginRoute, navOptions)
}

fun NavGraphBuilder.loginScreen(
    onInputLoginClick: () -> Unit,
) {
    composable(route = loginRoute) {
        Login1(onInputLoginClick = onInputLoginClick)
    }
}
