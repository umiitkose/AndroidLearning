package com.umiitkose.androidlearning.kotlinExample.basics

fun main() {
    /**
     *      Implicit Type Conversion : Ortulu - belirgin olmayan sekilde tip donusumu.
     *      Explicit Type Conversion : Acik - belirgin tip donusumu
     * **/

    /**
     *      Kotlin'de implicit type conversion yoktur.
     * **/
//    val number : Int = (Int) 3L // Calismaz. Comment'i kaldir kontrol et istersen keko

    /**
     *      Tip donusumu icin kullanabileceginiz fonksiyonlar;
     *      toByte(), toShort(), toInt(), toLong(), toDouble(), toFloat(), toChar(), toString(),
     *      toUByte(), toUShort(), toUInt(), toULong(), toDuration(), toBigDecimal(), toBigInteger()
     * **/

    /* ---- -- */

    /**
     *      Numbers.kt icerisindeki degisken tiplerinin deger araliklarini inceleyiniz.
     *      Deger araligi buyuk olan tipler kucuk olan tiplere acik olarak(explicit) donusturulurken dikkatli olunmalidir.
     *      Ust tipten bir degiskenin degeri, alt tipin deger araligindan pozitif yonde fazla buyuk,
     *      negatif yonde fazla kucuk ise bu tip donusumu sirasinda yanlis deger atamalari yapilacaktir.
     * **/
    val tcIdentityNumber = 15860826657
    val convertedInt = tcIdentityNumber.toInt()

    println("convertedInt : " + convertedInt)

    /**
     *      Kotlin'in sagladigi yukaridaki tip donusumlerinin yaninda, String to Number donusumler icin
     *      Java'dan asina oldugumuz tip donusumlerini de kullanabiliriz.
     *      Bunun icin ilgili tiplerin Java versionlarini kullanmalisiniz.
     *
     *      java.lang.Byte.parseByte(), java.lang.Short.parseShort(), java.lang.Int.parseInt(),
     *      java.lang.Long.parseLong(), java.lang.Double.parseDouble(), java.lang.Float.parseFloat(),
     *      java.lang.Byte.parseUByte(), java.lang.Short.parseUShort(), java.lang.Int.parseUInt(),
     *      java.lang.Long.parseULong(), java.lang.Double.parseUDouble(), java.lang.Float.parseUFloat()
     *  **/
    val byte: String = "3"
    val intValue = Integer.parseInt(byte)
}