package me.raiden.codelab.koin.data.datasources.remote

import android.util.Log

class LogInServiceImpl : LogInService {

    override fun logInt(email: String, password: String) {
        Log.i("REMOTE_EMAIL", email)
        Log.i("REMOTE_PASSWORD", password)
    }
}