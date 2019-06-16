package me.raiden.codelab.koin.domain.gateways

interface LogInGateway {
    fun logIn(email: String, password: String)
}