package me.raiden.codelab.koin.domain.usecases.login

import me.raiden.codelab.koin.domain.gateways.LogInGateway

class LogInUseCaseImpl(private val logInGateway: LogInGateway) : LogInUseCase {
    override fun logIn(email: String, password: String) {
        logInGateway.logIn(email, password)
    }
}