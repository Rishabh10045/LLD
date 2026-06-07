package DecoratorPattern_2.AddOns;

import DecoratorPattern_2.Coffee;

public class WhippedCream implements Coffee {
    public WhippedCream(Coffee coffee) {

    }

    @Override
    public String getCoffeeName() {
        return coffee.getCoffeeName() +"WhippedCream";
    }

    @Override
    public int getCoffeePrice() {
        return coffee.getCoffeePrice() + 200;
    }
}
