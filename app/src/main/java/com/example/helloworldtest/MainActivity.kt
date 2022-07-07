package com.example.helloworldtest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.onesignal.OneSignal

const val ONESIGNAL_APP_ID = "cab9a0dd-469c-497c-9ebe-e4e6ffc03b02"

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //OneSignal Logging
        OneSignal.setLogLevel(OneSignal.LOG_LEVEL.VERBOSE, OneSignal.LOG_LEVEL.NONE)

        // OneSignal Initialization
        OneSignal.initWithContext(this)
        OneSignal.setAppId(ONESIGNAL_APP_ID)
    }
}