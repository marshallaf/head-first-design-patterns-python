package pizza

class ChicagoStyleCheesePizza: Pizza() {
    override val name: String = "Chicago-style deep-dish cheese pizza"
    override val dough: String = "extra thick crust dough"
    override val sauce: String = "plum tomato sauce"
    override val toppings: List<String> = listOf("shredded mozzarella cheese")
    override fun cut() {
        println("Cutting the pizza into square slices.")
    }
}

class ChicagoStylePepperoniPizza: Pizza() {
    override val name: String = "Chicago-style deep-dish pepperoni pizza"
    override val dough: String = "extra thick crust dough"
    override val sauce: String = "plum tomato sauce"
    override val toppings: List<String> = listOf("shredded mozzarella cheese", "pepperoni")
    override fun cut() {
        println("Cutting the pizza into square slices.")
    }
}