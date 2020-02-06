package com.umiitkose.androidlearning.kotlinExample.functions

fun main() {
    higherOrderTest("Toplama",10,2, ::toplama)
}

fun higherOrderTest(islemTuru: String,
                    sayi1 : Int,
                    sayi2 : Int,
                    islem:(Int,Int) -> Int) {

    println(islemTuru)
    print("İşlem sonucu : ")
    println("${islem(sayi1,sayi2).toString()}")
}
fun toplama(a:Int,b:Int) : Int{
    return a+b
}