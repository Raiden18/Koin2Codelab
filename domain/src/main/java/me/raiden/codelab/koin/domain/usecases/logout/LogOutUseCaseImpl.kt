package me.raiden.codelab.koin.domain.usecases.logout

import me.raiden.codelab.koin.domain.gateways.LogOutGateway

class LogOutUseCaseImpl(private val logOutGateway: LogOutGateway) : LogOutUseCase {
    override fun logOut() {
        logOutGateway.logOut()
    }
}