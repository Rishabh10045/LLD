package DecoratorPattern_2.AddOns;

import DecoratorPattern_2.Coffee;

public class Milk implements Coffee {
    Coffee coffee;
   public Milk(Coffee coffee) {
       this.coffee = coffee;
       System.out.println(coffee);
    }

    @Override
    public String getCoffeeName() {
        return coffee.getCoffeeName() + "Milk";
    }

    @Override
    public int getCoffeePrice() {
        return coffee.getCoffeePrice()+ 80;
    }
}
