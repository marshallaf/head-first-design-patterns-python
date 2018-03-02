package ingredients

class NYIngredientFactory: IngredientFactory {
    override fun createDough(): Dough {
        return ThinCrustDough()
    }

    override fun createSauce(): Sauce {
        return MarinaraSauce()
    }

    override fun createCheese(): Cheese {
        return ReggianoCheese()
    }

    override fun createPepperoni(): Pepperoni {
        return SlicedPepperoni()
    }
}