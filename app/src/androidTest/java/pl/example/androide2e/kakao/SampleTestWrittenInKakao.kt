package pl.example.androide2e.kakao

import androidx.test.espresso.Espresso
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.filters.LargeTest
import com.agoda.kakao.screen.Screen
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import pl.example.androide2e.MainActivity

@LargeTest
@RunWith(AndroidJUnit4::class)
class SampleTestWrittenInKakao {
    @get:Rule
    val activityRule = ActivityScenarioRule(MainActivity::class.java)

    @Test
    fun sampleTest() {
        Screen.onScreen<SampleTestScreen> {
            textView {
                typeText("text")
            }

            closeSoftKeyboard()

            button {
                isEnabled()
                click()
            }

            textView {
                hasEmptyText()
            }
        }
    }
}