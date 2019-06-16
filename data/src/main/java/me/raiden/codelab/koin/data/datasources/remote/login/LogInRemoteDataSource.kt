package me.raiden.codelab.koin.data.datasources.remote.login

internal interface LogInRemoteDataSource {
    fun logInt(email: String, password: String)
}