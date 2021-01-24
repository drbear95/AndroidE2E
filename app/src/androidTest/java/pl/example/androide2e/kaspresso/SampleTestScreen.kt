package pl.example.androide2e.kaspresso

import com.agoda.kakao.edit.KEditText
import com.agoda.kakao.screen.Screen
import com.agoda.kakao.text.KButton
import com.kaspersky.kaspresso.screens.KScreen
import pl.example.androide2e.MainActivity
import pl.example.androide2e.R

object SampleTestScreen : KScreen<SampleTestScreen>() {
    override val layoutId: Int = R.layout.fragment_main
    override val viewClass: Class<*> = MainActivity::class.java

    val textView = KEditText { withId(R.id.text_view_one) }
    val button = KButton { withId(R.id.button_one) }
}