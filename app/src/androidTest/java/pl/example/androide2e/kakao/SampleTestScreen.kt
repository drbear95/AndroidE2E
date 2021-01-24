package pl.example.androide2e.kakao

import com.agoda.kakao.edit.KEditText
import com.agoda.kakao.screen.Screen
import com.agoda.kakao.text.KButton
import pl.example.androide2e.R

class SampleTestScreen : Screen<SampleTestScreen>() {
    val textView = KEditText { withId(R.id.text_view_one) }
    val button = KButton { withId(R.id.button_one) }
}