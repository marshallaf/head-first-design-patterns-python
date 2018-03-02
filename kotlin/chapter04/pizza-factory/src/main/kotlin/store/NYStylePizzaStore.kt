package store

import ingredients.NYIngredientFactory
import pizza.CheesePizza
import pizza.PepperoniPizza
import pizza.Pizza

class NYStylePizzaStore: PizzaStore() {
    override val ingredientFactory = NYIngredientFactory()

    override fun createPizza(type: String): Pizza? {
        return when (type) {
            "cheese" -> {
                val pizza: Pizza = CheesePizza(ingredientFactory)
                pizza.name = "New York Style Cheese Pizza"
                pizza
            }
            "pepperoni" -> {
                val pizza: Pizza = PepperoniPizza(ingredientFactory)
                pizza.name = "New York Style Pepperoni Pizza"
                pizza
            }
            else -> null
        }
    }
}