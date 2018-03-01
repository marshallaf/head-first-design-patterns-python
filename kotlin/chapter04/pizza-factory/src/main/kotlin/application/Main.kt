package application

import store.ChicagoStylePizzaStore
import store.NYStylePizzaStore
import store.PizzaStore

fun main(args: Array<String>) {
    val nyPizzaStore: PizzaStore = NYStylePizzaStore()
    val chicagoPizzaStore: PizzaStore = ChicagoStylePizzaStore()

    val nyPizza = nyPizzaStore.orderPizza("cheese")
    println("Ethan ordered a ${nyPizza.name}\n")

    val chicagoPizza = chicagoPizzaStore.orderPizza("cheese")
    println("Joel ordered a ${chicagoPizza.name}\n")
}