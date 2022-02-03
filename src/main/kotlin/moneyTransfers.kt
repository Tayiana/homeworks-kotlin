package ru.netology

/**Задача №1 - Денежные переводы*/

fun main() {
    val amount = 10000.55
    val minCommission = 35.00
    val standardCommission = amount * 0.0075

    val amountCharged: Double = if (standardCommission < minCommission)
        amount + minCommission
    else
        amount + standardCommission

    println(String.format("%.2f", amountCharged))
}