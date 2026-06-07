package DecoratorPattern;

public class WhippedCream extends AddOns{
    public WhippedCream(Coffee coffee) {
        super(coffee);
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
