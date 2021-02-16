package com.enigmacamp.mybasicdagger

class CarContainer {
    private val engine = Engine()
    val car = Car(engine)
}