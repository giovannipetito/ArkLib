package it.giovanni.arklib

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import it.giovanni.archive.Toaster

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val text = findViewById<TextView>(R.id.hello_world)
        text.text = Toaster.getMessage()

        Toaster.simpleToast(this, "Benvenuto al corso avanzato Android PuntoNet!")
    }
}