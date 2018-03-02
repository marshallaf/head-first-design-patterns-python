package pizza

import ingredients.IngredientFactory

class PepperoniPizza(factory: IngredientFactory): Pizza() {
    override var name: String = "cheese pizza"
    override val dough = factory.createDough()
    override val sauce = factory.createSauce()
    override val toppings = listOf(factory.createCheese(), factory.createPepperoni())
}
