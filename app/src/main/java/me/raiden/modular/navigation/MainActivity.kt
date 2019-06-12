package me.raiden.modular.navigation

import me.vponamorenko.modular.navigation.android.NavigationActivity
import me.vponamorenko.modular.navigation.router.Router
import org.koin.android.ext.android.inject

class MainActivity : NavigationActivity() {
    override val router: Router by inject()
    override fun layoutId() = R.layout.activity_main
}
