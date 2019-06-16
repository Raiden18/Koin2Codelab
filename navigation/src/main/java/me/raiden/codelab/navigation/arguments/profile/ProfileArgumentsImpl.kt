package me.raiden.codelab.navigation.arguments.profile

import android.os.Bundle
import me.raiden.codelab.koin.questions.ProfileFragment

class ProfileArgumentsImpl : ProfileArguments {
    override fun setEmail(email: String): Bundle {
        val args = ProfileFragment.createBundle(email)
        return args
    }
}