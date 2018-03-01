package store

import pizza.NYStyleCheesePizza
import pizza.NYStylePepperoniPizza
import pizza.Pizza

class NYStylePizzaStore: PizzaStore() {
    override fun createPizza(type: String): Pizza? {
        return when (type) {
            "cheese" -> NYStyleCheesePizza()
            "pepperoni" -> NYStylePepperoniPizza()
            else -> null
        }
    }
}