package com.aleangelozi.logcatmessageskotlin

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity

private const val TAG = "MyActivity"

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // From top-down, every type of log message shows all types of log messages below it.
        Log.v(TAG, "Verbose log.")
        Log.d(TAG, "Debug log.")
        Log.i(TAG, "Info log.")
        Log.w(TAG, "Warning log.")
        Log.e(TAG, "Error log.")
    }
}