package DecoratorPattern_2.AddOns;

import DecoratorPattern_2.Coffee;

public class ExtraSugar implements Coffee {
    public ExtraSugar(Coffee coffee) {

    }

    @Override
    public String getCoffeeName() {
        return coffee.getCoffeeName()+ " , "+ "Extra Sugar";
    }

    @Override
    public int getCoffeePrice() {
        return coffee.getCoffeePrice()+ 20;
    }
}
