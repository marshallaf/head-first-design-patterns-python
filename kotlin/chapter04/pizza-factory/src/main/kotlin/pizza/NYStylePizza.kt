package pizza

class NYStyleCheesePizza: Pizza() {
    override val name: String = "NY-style cheese pizza"
    override val dough: String = "thin crust dough"
    override val sauce: String = "marinara sauce"
    override val toppings: List<String> = listOf("grated reggiano cheese")
}

class NYStylePepperoniPizza: Pizza() {
    override val name: String = "NY-style pepperoni pizza"
    override val dough: String = "thin crust dough"
    override val sauce: String = "marinara sauce"
    override val toppings: List<String> = listOf("grated reggiano cheese", "pepperoni")
}