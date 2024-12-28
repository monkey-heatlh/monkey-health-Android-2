package com.example.data.datasource.auth

interface AuthDataSource {
    object AUTH {
        private const val path = "api/auth"

        const val auth = "$path/"
        const val signUp = "$path/signup"
        const val signIn = "$path/signin"
        const val send = "$path/email/send"
        const val verify = "$path/email/verify"
    }
}