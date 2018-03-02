package store

import ingredients.ChicagoIngredientFactory
import ingredients.IngredientFactory
import pizza.*

class ChicagoStylePizzaStore: PizzaStore() {
    override val ingredientFactory = ChicagoIngredientFactory()

    override fun createPizza(type: String): Pizza? {
        return when (type) {
            "cheese" -> {
                val pizza: Pizza = CheesePizza(ingredientFactory)
                pizza.name = "Chicago Style Cheese Pizza"
                pizza
            }
            "pepperoni" -> {
                val pizza: Pizza = PepperoniPizza(ingredientFactory)
                pizza.name = "Chicago Style Pepperoni Pizza"
                pizza
            }
            else -> null
        }
    }
}

