package me.raiden.codelab.koin.domain.usecases.login

interface LogInUseCase {
    fun logIn(email: String, password: String)
}