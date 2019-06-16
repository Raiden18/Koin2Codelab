package me.raiden.codelab.navigation.navigators

import me.raiden.codelab.koin.profile.ProfileNavigation
import me.raiden.codelab.navigation.router.Router

internal class ProfileNavigationImpl(private val navigationController: Router) : ProfileNavigation {
    override fun logOut() {
        navigationController.goBack()
    }
}