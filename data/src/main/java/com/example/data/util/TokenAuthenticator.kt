package com.example.data.util

import javax.inject.Inject

class TokenAuthenticator @Inject constructor(
    private val dataSource: AuthTokenDataSource
) {
}