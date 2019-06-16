package me.raiden.codelab.navigation.navigators

import io.mockk.spyk
import io.mockk.verify
import me.raiden.codelab.navigation.question.R
import me.raiden.codelab.navigation.router.Router
import me.raiden.codelab.koin.login.LogInNavigation
import org.junit.Before
import org.junit.Test

internal class QuestionNavigationImplTest {
    lateinit var navigationController: Router
    lateinit var questionNavigationImpl: LogInNavigation

    @Before
    fun setUp() {
        navigationController = spyk()
        questionNavigationImpl = LogInNavigationImpl(navigationController)
    }

    @Test
    fun `Should open wrong answer screen`() {
        questionNavigationImpl.openProfile()
        verify { navigationController.navigate(R.id.action_questionFragment_to_wrongAnswerFragment) }
    }

    @Test
    fun `Should open right answer screen`() {
        questionNavigationImpl.openRightAnswer()
        verify { navigationController.navigate(R.id.action_questionFragment_to_rightAnswerFragment) }
    }

}