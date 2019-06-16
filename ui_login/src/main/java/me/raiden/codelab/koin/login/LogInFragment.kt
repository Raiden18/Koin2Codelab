package me.raiden.codelab.koin.login

import android.widget.Toast
import androidx.lifecycle.Observer
import me.raiden.codelab.koin.base.BaseFragment
import me.raiden.codelab.koin.login.databinding.FragmentQuestionBinding
import org.koin.android.scope.currentScope
import org.koin.android.viewmodel.ext.android.viewModel

class LogInFragment : BaseFragment<LogInViewModel, FragmentQuestionBinding>() {
    override val viewModel: LogInViewModel by currentScope.viewModel(this)
    override val layoutId: Int = R.layout.fragment_question

    override fun onCreateView() {
        binding.viewModel = viewModel
        observeValidLogInData()
    }

    private fun observeValidLogInData() {
        viewModel.isValidData.observe(this, Observer {
            if (!it) {
                showEmptyFieldMessage()
            }
        })
    }

    private fun showEmptyFieldMessage() {
        Toast.makeText(context!!, "Fields must be filled in", Toast.LENGTH_SHORT).show()
    }
}