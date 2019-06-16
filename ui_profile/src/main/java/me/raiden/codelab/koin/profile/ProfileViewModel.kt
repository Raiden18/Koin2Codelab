package me.raiden.codelab.koin.profile

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import me.raiden.codelab.koin.domain.usecases.logout.LogOutUseCase

class ProfileViewModel(
    private val navigation: ProfileNavigation,
    private val logOutUseCase: LogOutUseCase,
    private val email: String
) : ViewModel() {
    var emailLiveData = MutableLiveData<String>().apply {
        value = email
    }


    fun onLogOutClick() {
        logOutUseCase.logOut()
        navigation.logOut()
    }
}