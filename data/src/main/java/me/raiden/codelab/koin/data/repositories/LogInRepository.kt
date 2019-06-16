package me.raiden.codelab.koin.data.repositories

import me.raiden.codelab.koin.data.datasources.remote.login.LogInRemoteDataSource
import me.raiden.codelab.koin.domain.gateways.LogInGateway

internal class LogInRepository(private val remoteDataSourceLogIn: LogInRemoteDataSource) : LogInGateway {
    override fun logIn(email: String, password: String) {
        remoteDataSourceLogIn.logInt(email, password)
    }
}