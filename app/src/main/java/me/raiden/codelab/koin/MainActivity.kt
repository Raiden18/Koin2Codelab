package me.raiden.codelab.koin

import me.raiden.codelab.navigation.android.NavigationActivity
import me.raiden.codelab.navigation.router.Router
import org.koin.android.ext.android.inject

class MainActivity : NavigationActivity() {
    override val router: Router by inject()
    override fun layoutId() = R.layout.activity_main
}
