package DecoratorPattern;

public class Caramel extends AddOns{
    public Caramel(Coffee coffee) {
        super(coffee);
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
