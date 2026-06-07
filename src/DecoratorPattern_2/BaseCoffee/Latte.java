package DecoratorPattern_2.BaseCoffee;

import DecoratorPattern_2.Coffee;

public class Latte implements Coffee {
    @Override
    public String getCoffeeName() {
        return "Latte";
    }

    @Override
    public int getCoffeePrice() {
        return 100;
    }
}
