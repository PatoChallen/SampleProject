package com.patofch.sampleproject.application

import android.app.Application
import com.patofch.sampleproject.di.DaggerAppComponent

class SampleApplication: Application() {

    val appComponent = DaggerAppComponent.create()
}