package com.google.codelabs.mdc.kotlin.StoreExample.application

import android.app.Application
import androidx.appcompat.app.AppCompatDelegate

class StoreExample : Application() {
    companion object {
        lateinit var instance: StoreExample
            private set
    }

    override fun onCreate() {
        super.onCreate()
        instance = this

        AppCompatDelegate.setCompatVectorFromResourcesEnabled(true)
    }

}