package DecoratorPattern;

public class Cappuccino implements Coffee{
    @Override
    public String getCoffeeName() {
        return "Cappuccino";
    }

    @Override
    public int getCoffeePrice() {
        return 200;
    }
}
