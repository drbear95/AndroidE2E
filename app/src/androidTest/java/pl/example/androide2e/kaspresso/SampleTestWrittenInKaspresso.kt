package pl.example.androide2e.kaspresso

import androidx.test.espresso.Espresso.closeSoftKeyboard
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.filters.LargeTest
import com.kaspersky.kaspresso.annotations.ScreenShooterTest
import com.kaspersky.kaspresso.testcases.api.testcaserule.TestCaseRule
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import pl.example.androide2e.MainActivity

@LargeTest
@RunWith(AndroidJUnit4::class)
class SampleTestWrittenInKaspresso {
    @get:Rule
    val activityRule = ActivityScenarioRule(MainActivity::class.java)

    @get:Rule
    val testCaseRule = TestCaseRule(javaClass.simpleName)

    @ScreenShooterTest
    @Test
    fun test() =
        testCaseRule.run {
            step("Type test in text view one") {
                SampleTestScreen {
                    textView {
                        typeText("text")
                    }
                }

                closeSoftKeyboard()
            }

            step("Click on button one") {
                SampleTestScreen {
                    button {
                        isEnabled()
                        click()
                    }
                }
            }

            step("Check if text view has an empty text") {
                SampleTestScreen {
                    textView {
                        hasEmptyText()
                    }
                }
            }
        }
}