package me.raiden.codelab.navigation.navigators

import me.raiden.codelab.koin.login.LogInNavigation
import me.raiden.codelab.navigation.arguments.profile.ProfileArguments
import me.raiden.codelab.navigation.question.R
import me.raiden.codelab.navigation.router.Router

internal class LogInNavigationImpl(
    private val navigationController: Router,
    private val profileArguments: ProfileArguments
) : LogInNavigation {
    override fun openProfile(email: String) {
        val args = profileArguments.setEmail(email)
        navigationController.navigate(R.id.action_logInFragment_to_profileFragment, args)
    }
}