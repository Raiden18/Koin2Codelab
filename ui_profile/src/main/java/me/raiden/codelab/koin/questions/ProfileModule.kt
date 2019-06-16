package me.raiden.codelab.koin.questions

import org.koin.android.viewmodel.dsl.viewModel
import org.koin.core.qualifier.named
import org.koin.dsl.module

val profileModule = module {
    scope(named<ProfileFragment>()) {
        viewModel { (email: String) -> ProfileViewModel(get(), email) }
    }
}