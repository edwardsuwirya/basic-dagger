package com.enigmacamp.mybasicdagger

import dagger.Module
import dagger.Provides

@Module
class CarModule {
    @Provides
    fun provideCar(engineCarburator: EngineCarburator) = Car(engineCarburator)
}