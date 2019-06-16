package me.raiden.codelab.koin.data.datasources.remote.logout

import android.util.Log

class LogOutRemoteDataSourceImpl: LogOutRemoteDataSource {
    override fun logOut() {
        Log.i("REMOTE_LOGOUT", "LOG OUT")
    }
}