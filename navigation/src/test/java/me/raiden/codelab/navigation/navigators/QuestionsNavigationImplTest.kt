package me.raiden.codelab.navigation.navigators

import io.mockk.spyk
import io.mockk.verify
import me.raiden.codelab.navigation.arguments.questionfragment.QuestionFragmentArguments
import me.raiden.codelab.navigation.question.R
import me.raiden.codelab.navigation.router.Router
import org.junit.Before
import org.junit.Test

internal class QuestionsNavigationImplTest {
    lateinit var navigationController: Router
    lateinit var arguments: QuestionFragmentArguments
    lateinit var questionsNavigationImpl: QuestionsNavigation
    @Before
    fun setUp() {
        navigationController = spyk()
        arguments = spyk()
        questionsNavigationImpl = QuestionsNavigationImpl(navigationController, arguments)
    }

    @Test
    fun `Should set arguments for question screen`() {
        val questionId = 1

        questionsNavigationImpl.openQuestion(questionId)

        verify { arguments.setQuestionId(questionId) }
    }


    @Test
    fun `Should open question screen`() {
        val id = 1

        questionsNavigationImpl.openQuestion(id)
        val expectedArgs = arguments.setQuestionId(id)

        verify {
            navigationController.navigate(R.id.action_questionsFragment_to_questionFragment, expectedArgs)
        }
    }
}