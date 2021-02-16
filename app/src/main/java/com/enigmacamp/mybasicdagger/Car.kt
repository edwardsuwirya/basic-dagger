package com.enigmacamp.mybasicdagger

import javax.inject.Inject

/*
Dependency constructor injection
Alternatif lain selain menggunakan @Inject, bisa menggunakan @Module
 */
class Car(private val engine: IEngine) {
    fun start(): String {
        val info = engine.start()
        return info
    }

    fun stop(): String {
        val info = engine.stop()
        return info
    }
}