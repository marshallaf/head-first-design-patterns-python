package decorators

import drinks.Beverage

class Mocha(beverage: Beverage): CondimentDecorator(beverage = beverage) {
    override val description = "${beverage.description}, Mocha"
    override val cost = beverage.cost + 0.20
}