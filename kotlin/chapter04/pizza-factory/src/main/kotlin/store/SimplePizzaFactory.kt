package store

import pizza.*

class SimplePizzaFactory {
    fun createPizza(type: String): Pizza? {
        return when (type) {
            "cheese" -> CheesePizza()
            "pepperoni" -> PepperoniPizza()
            else -> null
        }
    }
}