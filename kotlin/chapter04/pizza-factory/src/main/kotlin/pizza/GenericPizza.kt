package pizza

class CheesePizza: Pizza() {
    override val name: String = "cheese pizza"
    override val dough: String = "regular dough"
    override val sauce: String = "tomato sauce"
    override val toppings: List<String> = listOf("cheese")
}

class PepperoniPizza: Pizza() {
    override val name: String = "pepperoni pizza"
    override val dough: String = "regular dough"
    override val sauce: String = "tomato sauce"
    override val toppings: List<String> = listOf("cheese", "pepperoni")
}