package com.umiitkose.androidlearning.kotlinExample.`class`

class NoSingleton {

    init {
        println("Örnek Oluşturuldu")
    }

    var isim: String? = null

}

fun main() {

    var ornek1 = NoSingleton()
    ornek1.isim = "Ümit"
    println(ornek1.isim)

    var ornek2 = NoSingleton()
    println(ornek2.isim)

    var ornek3 = NoSingleton()
    println(ornek3.isim)
}
/*
Örnek Oluşturuldu
Ümit
Örnek Oluşturuldu
null
Örnek Oluşturuldu
null
 */