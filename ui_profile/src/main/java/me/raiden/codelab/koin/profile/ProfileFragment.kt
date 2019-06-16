package me.raiden.codelab.koin.profile

import android.os.Bundle
import androidx.fragment.app.Fragment
import me.raiden.codelab.koin.base.BaseFragment
import me.raiden.codelab.koin.profile.databinding.FragmentProfileBinding
import org.koin.android.scope.currentScope
import org.koin.android.viewmodel.ext.android.viewModel
import org.koin.core.parameter.parametersOf

class ProfileFragment : /*Base*/Fragment/*<ProfileViewModel, FragmentProfileBinding>*/() {
    companion object {
        const val EXTRA_EMAIL = "ProfileFragment.email"
        fun createBundle(email: String) = Bundle().apply {
            putString(EXTRA_EMAIL, email)
        }
    }

   /* override val viewModel: ProfileViewModel
    }
    override val layoutId = R.layout.fragment_profile

    override fun onCreateView() {
        binding.viewModel = viewModel
    }*/
}