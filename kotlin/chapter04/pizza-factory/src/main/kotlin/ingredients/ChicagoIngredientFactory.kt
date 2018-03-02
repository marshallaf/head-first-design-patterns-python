package ingredients

class ChicagoIngredientFactory: IngredientFactory {
    override fun createDough(): Dough {
        return ThickCrustDough()
    }

    override fun createSauce(): Sauce {
        return PlumTomatoSauce()
    }

    override fun createCheese(): Cheese {
        return MozzarellaCheese()
    }

    override fun createPepperoni(): Pepperoni {
        return SlicedPepperoni()
    }
}