package pl.example.androide2e.espresso

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions
import androidx.test.espresso.assertion.ViewAssertions
import androidx.test.espresso.matcher.ViewMatchers
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.filters.LargeTest
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import pl.example.androide2e.MainActivity
import pl.example.androide2e.R

@LargeTest
@RunWith(AndroidJUnit4::class)
class SampleTestWritten {
    @get:Rule
    val activityRule = ActivityScenarioRule(MainActivity::class.java)

    @Test
    fun sampleTest() {

        onView(withId(R.id.text_view_one)).perform(ViewActions.typeText("text"), ViewActions.closeSoftKeyboard())

        onView(withId(R.id.button_one)).perform(ViewActions.click())

        onView(withId(R.id.text_view_one)).check(ViewAssertions.matches(ViewMatchers.withText("")))
    }
}