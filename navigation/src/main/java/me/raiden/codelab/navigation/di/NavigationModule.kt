package me.raiden.codelab.navigation.di

import me.raiden.codelab.koin.login.LogInNavigation
import me.raiden.codelab.koin.questions.ProfileNavigation
import me.raiden.codelab.navigation.arguments.profile.ProfileArguments
import me.raiden.codelab.navigation.arguments.profile.ProfileArgumentsImpl
import me.raiden.codelab.navigation.navigators.LogInNavigationImpl
import me.raiden.codelab.navigation.navigators.ProfileNavigationImpl
import me.raiden.codelab.navigation.router.Router
import me.raiden.codelab.navigation.router.RouterImpl
import org.koin.dsl.module

val navigationModule = module(createdAtStart = true) {
    //Navigators
    single<LogInNavigation> { LogInNavigationImpl(get(), get()) }
    single<ProfileNavigation> { ProfileNavigationImpl(get()) }

    //Router
    single<Router> { RouterImpl() }

    //Arguments
    single<ProfileArguments> { ProfileArgumentsImpl() }
}