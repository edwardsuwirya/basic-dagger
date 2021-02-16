package com.enigmacamp.mybasicdagger

import javax.inject.Inject

class EngineCarburator @Inject constructor() : IEngine {
    override fun start() = "Engine Carburator is starting"
    override fun stop() = "Engine Carburator stopped"
}