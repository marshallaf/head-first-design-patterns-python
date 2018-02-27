package decorators

import drinks.Beverage

class SteamedMilk(beverage: Beverage): CondimentDecorator(beverage = beverage) {
    override val description = "${beverage.description}, Steamed milk"
    override val cost = beverage.cost + 0.10
}