package DecoratorPattern_2.BaseCoffee;

import DecoratorPattern_2.Coffee;

public class Cappuccino implements Coffee {
    @Override
    public String getCoffeeName() {
        return "Cappuccino";
    }

    @Override
    public int getCoffeePrice() {
        return 200;
    }
}
