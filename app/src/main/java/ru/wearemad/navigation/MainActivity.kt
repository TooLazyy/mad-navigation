package ru.wearemad.navigation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import ru.wearemad.mad_navigation.CiceroneHolder

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val h = CiceroneHolder()
        val r = h.getOrCreateRouter("asd")
        if (r != null) {

        }
    }
}