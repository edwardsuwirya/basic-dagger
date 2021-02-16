package com.enigmacamp.mybasicdagger

import javax.inject.Inject

/*
Dependency constructor injection
 */
class Car @Inject constructor(private val engine: Engine) {
    fun start(): String {
        val info = engine.start()
        return info
    }

    fun stop(): String {
        val info = engine.stop()
        return info
    }
}