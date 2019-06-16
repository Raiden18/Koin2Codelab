package me.raiden.codelab.koin.data.di

import me.raiden.codelab.koin.data.repositories.LogInRepository
import me.raiden.codelab.koin.domain.gateways.LogInGateway
import org.koin.dsl.module

val repositoriesModule = module(createdAtStart = true) {
    single<LogInGateway> { LogInRepository(get()) }
}