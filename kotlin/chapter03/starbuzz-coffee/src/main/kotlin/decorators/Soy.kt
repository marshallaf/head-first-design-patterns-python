package decorators

import drinks.Beverage

class Soy(beverage: Beverage): CondimentDecorator(beverage = beverage) {
    override val description = "${beverage.description}, Soy"
    override val cost = beverage.cost + 0.15
}