package pizza

import ingredients.Cheese
import ingredients.Dough
import ingredients.Sauce

abstract class Pizza {
    abstract var name: String
    abstract val dough: Dough
    abstract val sauce: Sauce
    abstract val toppings: List<Any>

    fun prepare() {
        println("Preparing $name:")
        println("Tossing dough...")
        println("Adding sauce...")
        println("Adding toppings:")
        toppings.forEach { println("   $it") }
    }
    fun bake() {
        println("Bake for 25 minutes at 350F.")
    }
    open fun cut() {
        println("Cutting the pizza into pie slices.")
    }
    fun box() {
        println("Place pizza in official PizzaStore box.")
    }
}