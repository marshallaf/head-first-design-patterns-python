package store

import pizza.*

class ChicagoStylePizzaStore: PizzaStore() {
    override fun createPizza(type: String): Pizza? {
        return when (type) {
            "cheese" -> ChicagoStyleCheesePizza()
            "pepperoni" -> ChicagoStylePepperoniPizza()
            else -> null
        }
    }
}

