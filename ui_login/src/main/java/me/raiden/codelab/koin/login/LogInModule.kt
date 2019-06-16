package me.raiden.codelab.koin.login

import me.raiden.codelab.koin.domain.usecases.login.LogInUseCase
import me.raiden.codelab.koin.domain.usecases.login.LogInUseCaseImpl
import org.koin.android.viewmodel.dsl.viewModel
import org.koin.core.qualifier.named
import org.koin.dsl.module

val logInModule = module {
    scope(named<LogInFragment>()) {
        scoped<LogInUseCase> { LogInUseCaseImpl(get()) }
        viewModel { LogInViewModel(get(), get()) }
    }
}