package DecoratorPattern_2.AddOns;

import DecoratorPattern_2.Coffee;

public class Caramel implements Coffee {
    Coffee coffee;
    public Caramel(Coffee coffee) {
        this.coffee = coffee;
        System.out.println(coffee);
    }

    @Override
    public String getCoffeeName() {
        return coffee.getCoffeeName()+ "Caramel";
    }

    @Override
    public int getCoffeePrice() {
        return coffee.getCoffeePrice()+ 50;
    }
}
