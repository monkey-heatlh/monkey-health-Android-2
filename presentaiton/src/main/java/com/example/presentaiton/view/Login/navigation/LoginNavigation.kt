package com.example.presentation.view.Login.navigation

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavOptions
import androidx.navigation.compose.composable
import com.example.presentation.view.Login.screen.LoginRoute

const val loginRoute = "login_route"

fun NavController.navigateToLogin(navOptions: NavOptions? = null) {
    this.navigate(loginRoute, navOptions)
}

fun NavGraphBuilder.loginScreen(
    onSignUpClick: () -> Unit,
    onInputLoginClick: () -> Unit,
) {
    composable(route = loginRoute) {
        LoginRoute(
            onSignUpClick = onSignUpClick,
            onInputLoginClick = onInputLoginClick
        )
    }
}
