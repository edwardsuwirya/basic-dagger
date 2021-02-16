package com.enigmacamp.mybasicdagger

import javax.inject.Inject

class Engine @Inject constructor() {
    fun start() = "Engine is starting"
    fun stop() = "Engine stopped"
}