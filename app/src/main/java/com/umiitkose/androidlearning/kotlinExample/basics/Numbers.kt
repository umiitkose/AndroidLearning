package com.umiitkose.androidlearning.kotlinExample.basics

fun main() {

    //sayısal bir değerler için 4 değişken kullanılır.(Byte,Short,Int,Long) Aldıkları max, ve min değerler:

    /* ------------------ BYTE -------------  */
    println("byteMax : " + Byte.MAX_VALUE)
    println("byteMin : " + Byte.MIN_VALUE)

    /* -------------- Short ------------------ */
    println("shortMax : " + Short.MAX_VALUE)
    println("ShortMin : " + Short.MIN_VALUE)

    /* ------------ Int --------------------- */

    println("IntMax : " + Int.MAX_VALUE)
    println("IntMin : " + Int.MIN_VALUE)

    /* ------------- Long ------------------- */

    println("LongMax : " + Long.MAX_VALUE)
    println("LongMin : " + Long.MIN_VALUE)


    /**
     *      Type    |   Size (bits) |       Min value                           |   Max value
     *      --------------------------------------------------------------------------------------
     *      Byte    |   8 bit       |       -128                                |   127
     *      Short   |   16 bit      |       -32768                              |   32767
     *      Int     |   32 bit      |       -2,147,483,648 (-2^31)              |   2,147,483,647 (2^31 - 1)
     *      Long    |   64 bit      |       -9,223,372,036,854,775,808 (-2^63)  |   9,223,372,036,854,775,807 (2^63 - 1)
     */

    /* -------- Ondalık Sayılar içinse Float ve Double kullanılır. -------------- */


    /* ------------ Int --------------------- */

    println("FloatMax : " + Float.MAX_VALUE)
    println("FloatMin : " + Float.MIN_VALUE)

    /* ------------- Long ------------------- */

    println("DoubleMax : " + Double.MAX_VALUE)
    println("DoubleMin : " + Double.MIN_VALUE)

    /**
     *      Type    |   Size (bits) |   Significant bits    |   Exponent bits   |   Decimal digits
     *      --------------------------------------------------------------------------------------
     *      Float   |       32      |           24          |       8           |       6-7
     *      Double  |       64      |           53          |       11          |       15-16
     */


    /**
     *      Long        degiskenler icin sayinin sonuna "L" konularak deger atamasi yapilabilir.
     *      Float       degiskenler icin sayinin sonuna "F" ve "f" konularak deger atamasi yapilabilir.
     *      Double      degiskenler icin geleneksel gosterim desteklenir.
     *      Decimal     tanimi yapilabilir      [0-9]
     *      Octal       tanimi yapilamiyor      [0-7]
     *      Hexadecimal tanimi yapilabilir
     *      Binary      tanimi yapilabilir      [0-1]
     */

    val longNumber = 1586L
    val floatNumber1 = 19.90F
    val floatNumber2 = 13f
    val doubleNumber = 3.14
    val doubleNumber2 = 3.14e10
    val decimalNumber = 1907
//    val octalNumber = 0197    // Calismaz. Comment'i kaldir kontrol et istersen keko
    val hexadecimalNumber = 0x759
    val binaryNumber = 0b01000011

    //Değişkenin tipinin kontrolünü is değişkeni ile yapabilirsiniz. (is burada infix fonksiyon olarak kullanılıyor. Dersi ileride anlatılacak.)
    println(longNumber is Long)

    //Değişkeninin tipinin değişken.javaClass.name ile öğrenebilirsiniz.
    println(longNumber.javaClass.name)
    println(doubleNumber2.javaClass.name)

    /**
     *      Backend'ten donen Double ve Float degiskenleri kullanirken dikkatli olmaniz gerekiyor.
     *      Eger backend'ten donen deger uzerinde "." isaretine gore bir split isi yapacaksaniz basiniz agriyabilir.
     *      Cunku backend'ten donen Double ve Float degiskenleri her zaman "." ile ayrismiyor olabilir.
     *      Database dilinin farkli olmasina gore (turkce-ingilizce gibi) "." yerine "," ile de ayrisiyor olabilir.
     */

}
