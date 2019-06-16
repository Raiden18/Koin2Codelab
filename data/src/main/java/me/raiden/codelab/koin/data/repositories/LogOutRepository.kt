package me.raiden.codelab.koin.data.repositories

import me.raiden.codelab.koin.data.datasources.remote.logout.LogOutRemoteDataSource
import me.raiden.codelab.koin.domain.gateways.LogOutGateway

class LogOutRepository(private val remoteDataSource: LogOutRemoteDataSource) : LogOutGateway {
    override fun logOut() {
        remoteDataSource.logOut()
    }
}