package store

import ingredients.IngredientFactory
import pizza.Pizza

abstract class PizzaStore {
    abstract val ingredientFactory: IngredientFactory

    fun orderPizza(type: String): Pizza {
        val pizza = createPizza(type) ?: throw NullPointerException()
        pizza.prepare()
        pizza.bake()
        pizza.cut()
        pizza.box()
        return pizza
    }

    abstract fun createPizza(type: String): Pizza?
}