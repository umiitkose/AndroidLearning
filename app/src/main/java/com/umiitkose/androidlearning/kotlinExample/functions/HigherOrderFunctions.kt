package com.umiitkose.androidlearning.kotlinExample.functions

import java.util.*
import kotlin.concurrent.schedule

fun main() {
    printUserInfo(getName(), { surname ->
        "surname : $surname"
    }, getAge())

    getItemClickListener { buttonName ->
        println(buttonName)
    }
}

fun getName(): String = "Ümit"


fun getAge(): Int = 25

fun printUserInfo(name: String, getSurName: (surname: String) -> String, age: Int) {
    print("name: $name, age: $age" + getSurName(" KÖSE"))
}

fun getItemClickListener(onClick: (String) -> Unit) {
    print("\nBaşladı \n")
    Timer().schedule(3000) {
        onClick("Login")

        print("Bitti \n")

    }
}


class News {
    fun getNewsType(newsType: Int): String {
        return when (newsType) {
            1 -> "Breaking"
            2 -> "Urgent"
            3 -> "Local"
            4 -> "Global"
            else -> "Normal"
        }
    }



}
