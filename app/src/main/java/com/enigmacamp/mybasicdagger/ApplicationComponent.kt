package com.enigmacamp.mybasicdagger

import dagger.Component

/*
    Dagger akan membuat sebuah dependency graph / peta dependency di dalam aplikasi android kita,
    sehingga nantinya kita dengan memudah mencari/menggunakan dependency apabila dibutuhkan.
    Untuk membuat dependency graph kita perlu membuat sebuah interface @Component

    Ketika kita melakukan build project, Dagger akan men-generate class implementation dari interface
    @Component
 */
@Component
interface ApplicationComponent {
    fun car(): Car
}