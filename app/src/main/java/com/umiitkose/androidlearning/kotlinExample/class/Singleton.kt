package com.umiitkose.androidlearning.kotlinExample.`class`

object Singleton {

    init {
        println("Örnek Oluşturuldu")
    }

    var isim: String? = null

}

fun main() {

    var ornek1 = Singleton
    ornek1.isim = "Ümit"
    println(ornek1.isim)

    var ornek2 = Singleton
    println(ornek2.isim)

    var ornek3 = Singleton
    println(ornek3.isim)
}
/* Çıktı : */
/*
Örnek Oluşturuldu
Ümit
Ümit
Ümit
 */

/* Java 'da 1 --> Constructor private
* 2 --> private static değişken
* 3 --> public static bir class ile null değişken kontrolü
* 4 --> @Volatile ile değişken @Synchozed ile de method ile multithread kontrolü */