package application

import decorators.Mocha
import decorators.Soy
import decorators.Whip
import drinks.Beverage
import drinks.DarkRoast
import drinks.Espresso
import drinks.HouseBlend

fun main(args: Array<String>) {
    val beverage: Beverage = Espresso()
    printBeverage(beverage)

    var beverage2: Beverage = DarkRoast()
    beverage2 = Mocha(beverage2)
    beverage2 = Mocha(beverage2)
    beverage2 = Whip(beverage2)
    printBeverage(beverage2)

    var beverage3: Beverage = HouseBlend()
    beverage3 = Soy(beverage3)
    beverage3 = Mocha(beverage3)
    beverage3 = Whip(beverage3)
    printBeverage(beverage3)
}

fun printBeverage(beverage: Beverage) {
    println("${beverage.description}: $${beverage.cost}")
}