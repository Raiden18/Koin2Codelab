package me.raiden.codelab.koin.data.di

import me.raiden.codelab.koin.data.datasources.remote.LogInService
import me.raiden.codelab.koin.data.datasources.remote.LogInServiceImpl
import org.koin.dsl.module

val remoteDataSourcesModule = module(createdAtStart = true) {
    single<LogInService> { LogInServiceImpl() }
}
