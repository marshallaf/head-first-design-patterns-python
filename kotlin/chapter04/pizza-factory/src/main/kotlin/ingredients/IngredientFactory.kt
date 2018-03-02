package ingredients

interface IngredientFactory {
    fun createDough(): Dough
    fun createSauce(): Sauce
    fun createCheese(): Cheese
    fun createPepperoni(): Pepperoni
}