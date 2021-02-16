package com.enigmacamp.mybasicdagger

import dagger.Component

/*
    Dagger akan membuat sebuah dependency graph / peta dependency di dalam aplikasi android kita,
    sehingga nantinya kita dengan memudah mencari/menggunakan dependency apabila dibutuhkan.
    Untuk membuat dependency graph kita perlu membuat sebuah interface @Component

    Ketika kita melakukan build project, Dagger akan men-generate class implementation dari interface
    @Component

    Gunakan constructor injection sebisa mungkin ketika mendaftarkan Dagger Dependency Graph, alternatif lainnya
    - Gunakan @Binds apabila kita memiliki dependecy yang kita buat sendiri
    - Gunakan @Provides apabila kita menggunakan dependency 3rd Party
 */
@Component
interface ApplicationComponent {
    /*
        Kita memberitahu Dagger bahwa MainActivity akan membutuhkan dependency yang ada di graph
     */
    fun inject(activity: MainActivity)
}