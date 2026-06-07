package DecoratorPattern;

public class Espresso implements Coffee{

    @Override
    public String getCoffeeName() {
        return "Espresso";
    }

    @Override
    public int getCoffeePrice() {
        return 300;
    }
}
