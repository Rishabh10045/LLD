package DecoratorPattern_2.BaseCoffee;

import DecoratorPattern_2.Coffee;

public class Espresso implements Coffee {

    @Override
    public String getCoffeeName() {
        return "Espresso";
    }

    @Override
    public int getCoffeePrice() {
        return 300;
    }
}
