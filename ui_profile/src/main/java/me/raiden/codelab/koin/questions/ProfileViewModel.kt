package me.raiden.codelab.koin.questions

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ProfileViewModel(
    private val navigation: ProfileNavigation,
    private val email: String
) : ViewModel() {
    var emailLiveData = MutableLiveData<String>().apply {
        value = email
    }


    fun onLogOutClick() {
        navigation.logOut()
    }
}