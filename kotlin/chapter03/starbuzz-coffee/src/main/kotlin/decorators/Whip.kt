package decorators

import drinks.Beverage

class Whip(beverage: Beverage): CondimentDecorator(beverage = beverage) {
    override val description = "${beverage.description}, Whip"
    override val cost = beverage.cost + 0.10
}