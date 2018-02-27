package decorators

import drinks.Beverage

abstract class CondimentDecorator(val beverage: Beverage): Beverage() {
    abstract override val description: String
    abstract override val cost: Double
}