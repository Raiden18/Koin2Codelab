package me.raiden.codelab.koin.data.datasources.remote

internal interface LogInService {
    fun logInt(email: String, password: String)
}