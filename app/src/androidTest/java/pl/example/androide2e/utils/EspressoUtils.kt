package pl.example.androide2e.utils

import android.app.Instrumentation
import android.view.View
import androidx.test.espresso.ViewAction
import androidx.test.platform.app.InstrumentationRegistry
import androidx.test.uiautomator.BySelector
import androidx.test.uiautomator.UiDevice
import androidx.test.uiautomator.UiObject2
import androidx.test.uiautomator.Until
import org.hamcrest.Matcher
import java.util.concurrent.TimeUnit
import java.util.concurrent.TimeoutException

private val instrumentation: Instrumentation = InstrumentationRegistry.getInstrumentation()
private val uiDevice: UiDevice = UiDevice.getInstance(instrumentation)

//fun waitUntil(matcher: Matcher<View>): ViewAction = object : ViewAction {
//
//    override fun getConstraints(): Matcher<View> {
//        return any(View::class.java)
//    }
//
//    override fun getDescription(): String {
//        return StringDescription().let {
//            matcher.describeTo(it)
//            "wait until: $it"
//        }
//    }
//
//    override fun perform(uiController: UiController, view: View) {
//        if (!matcher.matches(view)) {
//            ViewPropertyChangeCallback(matcher, view).run {
//                try {
//                    IdlingRegistry.getInstance().register(this)
//                    view.viewTreeObserver.addOnDrawListener(this)
//                    uiController.loopMainThreadUntilIdle()
//                } finally {
//                    view.viewTreeObserver.removeOnDrawListener(this)
//                    IdlingRegistry.getInstance().unregister(this)
//                }
//            }
//        }
//    }
//}