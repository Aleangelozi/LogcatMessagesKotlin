package com.aleangelozi.logcatmessageskotlin

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.aleangelozi.logcatmessageskotlin.databinding.ActivityMainBinding

private const val TAG = "MyActivity"

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        // From top-down, every type of log message shows all types of log messages below it.
        Log.v(TAG, "Verbose log.")
        Log.d(TAG, "Debug log.")
        Log.i(TAG, "Info log.")
        Log.w(TAG, "Warning log.")
        Log.e(TAG, "Error log.")
    }
}