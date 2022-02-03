package ru.netology

/**Задача №3 - "Меломан"*/

fun main() {

    val previousSpentAmount = 1001.20
    val amount = 800.10
    val state = true

    val noDiscount = 0.00
    val simpleDiscount = 100.00
    val discountFromAmount = 0.05
    val discountMusicLovers = 0.01

//находим стоимость заказа с учетом предыдущей покупки
    val amountDependingPreviousSpent: Double =
        if (previousSpentAmount <= 1000.00)
            amount - noDiscount
        else
            (if (previousSpentAmount > 1001.00 && previousSpentAmount <= 10000.00)
                amount - simpleDiscount
            else
                (amount - amount * discountFromAmount))
    println(amountDependingPreviousSpent)

//находим итоговую стоимость заказа с учетом того, постоянный ли клиент
    val myAmountWithDiscount =
        if (state == false) amountDependingPreviousSpent
        else (amountDependingPreviousSpent - amountDependingPreviousSpent * discountMusicLovers)
    println(String.format("%.2f", myAmountWithDiscount))
}