package com.enigmacamp.mybasicdagger

import android.app.Application

class BaseApplication : Application() {
    val appComponent = DaggerApplicationComponent.create()
}