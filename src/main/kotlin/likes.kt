package ru.netology

/**Задача №2 - "Люди/Человеки"*/

fun main() {
    val likes = 61
    val message: String = if ((likes === 1) || (likes > 20 && likes % 10 === 1)) "Понравилось $likes человеку"
    else if (likes == 0) "Ещё никому не понравилось" // можно оставить пустым, тогда ничего выводиться не будет
    else "Понравилось $likes людям"
    println(message)
}
