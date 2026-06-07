package DecoratorPattern;

public class Milk extends AddOns{
   public Milk(Coffee coffee) {
        super(coffee);
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
