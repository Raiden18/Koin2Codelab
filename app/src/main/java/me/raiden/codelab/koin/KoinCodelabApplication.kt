package me.raiden.codelab.koin

import android.app.Application
import me.raiden.codelab.koin.data.di.remoteDataSourcesModule
import me.raiden.codelab.koin.data.di.repositoriesModule
import me.raiden.codelab.koin.login.logInModule
import me.raiden.codelab.koin.questions.profileModule
import me.raiden.codelab.navigation.di.navigationModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class KoinCodelabApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        initKoin()
    }

    private fun initKoin() {
        startKoin {
            modules(
                listOf(
                    navigationModule,
                    logInModule,
                    remoteDataSourcesModule,
                    repositoriesModule,
                    profileModule
                )
            )
            androidContext(this@KoinCodelabApplication)
        }
    }
}