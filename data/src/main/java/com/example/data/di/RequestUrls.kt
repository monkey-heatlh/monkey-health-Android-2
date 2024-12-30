package com.example.data.di

internal object RequestUrls {
    object AUTH {
        private const val path = "api/auth"

        const val auth = "$path/"
        const val signUp = "$path/signup"
        const val signIn = "$path/signin"
        const val send = "$path/email/send"
        const val verify = "$path/email/verify"
    }

    object CALENDER {
        private const val path = "api/calender"

        const val calender = path
    }

    object ROUTINE {
        private const val path = "api/routine"

        const val routine = path
        const val send = "$path/send"
        const val save = "$path/save"
    }

    object AI {
        private const val path = "api/ai"

        const val ai = path
    }
}