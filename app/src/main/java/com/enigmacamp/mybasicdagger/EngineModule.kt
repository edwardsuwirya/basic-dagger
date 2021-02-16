package com.enigmacamp.mybasicdagger

import dagger.Binds
import dagger.Module

@Module
abstract class EngineModule {
    @Binds
    abstract fun bindsEngine(engineCarburator: EngineCarburator): IEngine
}