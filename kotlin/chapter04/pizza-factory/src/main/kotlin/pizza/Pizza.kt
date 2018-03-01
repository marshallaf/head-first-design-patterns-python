package pizza

abstract class Pizza {
    abstract val name: String
    abstract val dough: String
    abstract val sauce: String
    abstract val toppings: List<String>

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