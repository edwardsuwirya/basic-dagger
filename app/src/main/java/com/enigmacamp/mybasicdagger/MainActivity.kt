package com.enigmacamp.mybasicdagger

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import javax.inject.Inject

/*
 Mengimplementasikan dependency injection, memberikan keuntungan sebagai berikut
  - Code yang reuseable
  - Mempermudah refactoring
  - Mempermudah testing
 */
class MainActivity : AppCompatActivity() {
    private lateinit var resultTextView: TextView
    private lateinit var engineButton: Button
    var isEngineStart = false

    @Inject
    lateinit var car: Car

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        resultTextView = findViewById(R.id.result_textView)
        engineButton = findViewById(R.id.engine_button)
        engineButton.setText("Engine Start")
        (application as BaseApplication).appComponent.inject(this)
        engineButton.setOnClickListener {
            if (isEngineStart) {
                resultTextView.setText(car.stop())
                engineButton.setText("Engine Start")
            } else {
                resultTextView.setText(car.start())
                engineButton.setText("Engine Stop")
            }
            isEngineStart = !isEngineStart

        }


    }
}