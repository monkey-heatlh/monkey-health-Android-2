package com.example.data.util

import com.goms.datastore.datasource.auth.AuthTokenDataSource
import javax.inject.Inject

class TokenAuthenticator @Inject constructor(
    private val dataSource: AuthTokenDataSource
) {
}