package com.umiitkose.androidlearning.kotlinExample.`class`

class School {

    // Eğer class içinde class tanımlanıyorsa buna NestedInnerClass denir.
    val schoolName = "Codemy"
    private val schoolNamePrivate = "Codemy Private"

    //İlgili School class 'ına erişemez.
    class MedSchool {

        val studentCount = 5000

        fun printMedSchool() {
            // println("$schoolName")
        }
    }

    inner class innerSchool {

        //inner class outer class 'ın instance 'ı var ve içerde referanslarını tutuyor gibi düşün.  Bu durum private olsa bile değişmiyor.
        // Yine de inner class erişiyor.
        // inner class 'ta şöyle bir sorun var. Sen eğer class 'ı static tutarsan üst class 'ın referanslarını da statik tutuyor oluyorsun.
        // innerclass schoolName ve schoolNamePrivate olarak 'ta kullanılıyor.
        //Memory Leak 'e Dikkat et bu durumda.

        val studentCount = 5000

        fun printInnerSchool() {
            println("$schoolName")
            println("$schoolNamePrivate")
        }
    }

    /* inner class 'tan bir extend alınıp, outer class 'tanda extend alıp multi Intheriance elde edebilirsiniz. inner class 'ın içine inner class yazılabiliyor.*/

}

fun main() {

    //Nested Class 'a gidilecekse önce outer class yaratılıp sonrasında ilgili class 'a gidilir.

    val medSchool = School.MedSchool()
    println(medSchool.studentCount)
    println(medSchool.printMedSchool())

    //innerClass 'dan nesne olusturmak istiyorsan class 'ı () yapman gerek
    val lawSchool = School().innerSchool()
    println(lawSchool.printInnerSchool())

}