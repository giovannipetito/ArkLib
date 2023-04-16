package it.giovanni.archive

import android.content.Context
import android.widget.Toast

class Toaster {
    companion object {
        fun simpleToast(context: Context, message: String) {
            Toast.makeText(context, message, Toast.LENGTH_SHORT).show()
        }

        fun getMessage(): String {
            return "Benvenuto al corso avanzato Android PuntoNet!"
        }
    }
}