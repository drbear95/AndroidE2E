package pl.example.androide2e

import android.os.Bundle
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.widget.addTextChangedListener
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity(R.layout.activity_main) {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val layoutOne = findViewById<ViewGroup>(R.id.layout_one)
        val buttonOne = findViewById<Button>(R.id.button_one)
        val textViewOne = findViewById<TextInputEditText>(R.id.text_view_one)

        val layoutTwo = findViewById<ViewGroup>(R.id.layout_two)
        val buttonTwo = findViewById<Button>(R.id.button_two)
        val textViewTwo = findViewById<TextView>(R.id.text_view_two)

        val layoutThree = findViewById<ViewGroup>(R.id.layout_three)
        val buttonThree = findViewById<Button>(R.id.button_three)
        val textViewThree = findViewById<TextView>(R.id.text_view_three)

        buttonOne.setOnClickListener {
            textViewOne.setText("")
        }
        textViewOne.addTextChangedListener { textView ->
            textView?.length
                    ?.takeIf {
                        it > 0
                    }?.run {
                        buttonOne.run {
                            isEnabled = true
                        }
                    }
        }
    }
}