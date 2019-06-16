package me.raiden.codelab.koin.data.datasources.remote.login

import android.util.Log

class LogInRemoteDataSourceImpl : LogInRemoteDataSource {

    override fun logInt(email: String, password: String) {
        Log.i("REMOTE_EMAIL", email)
        Log.i("REMOTE_PASSWORD", password)
    }
}