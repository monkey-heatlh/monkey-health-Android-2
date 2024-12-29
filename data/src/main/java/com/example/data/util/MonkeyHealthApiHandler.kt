package com.example.data.util

class MonkeyHealthApiHandler<T> {
    private lateinit var httpRequest: suspend () -> T

    fun httpRequest(httpRequest: suspend () -> T) =
        this.apply { this.httpRequest = httpRequest}

}