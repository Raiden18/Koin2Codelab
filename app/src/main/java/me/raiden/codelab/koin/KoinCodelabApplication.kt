package me.raiden.codelab.koin

import android.app.Application

class KoinCodelabApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        initKoin()
    }

    private fun initKoin() {

    }
}