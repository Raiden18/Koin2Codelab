package me.raiden.codelab.koin.login

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import me.raiden.codelab.koin.domain.gateways.LogInGateway

class LogInViewModel(
    private val questionNavigation: LogInNavigation,
    private val logIngUseCase: LogInGateway
) : ViewModel() {
    var email = MutableLiveData<String>()
    var password = MutableLiveData<String>()
    var isValidData = MutableLiveData<Boolean>()

    fun onLogInClick() {
        val email = email.value
        val password = password.value
        if (email.isNullOrEmpty().not() && password.isNullOrEmpty().not()) {
            logInAndOpenCabinet()
        } else {
            isValidData.postValue(false)
        }
    }

    private fun logInAndOpenCabinet() {
        isValidData.postValue(true)
        logIngUseCase.logIn(email.value!!, password.value!!)
        questionNavigation.openProfile(email.value!!)
    }

    override fun onCleared() {
        isValidData.postValue(null)
        super.onCleared()
    }
}