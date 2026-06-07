package DecoratorPattern;

public class Latte implements Coffee{
    @Override
    public String getCoffeeName() {
        return "Latte";
    }

    @Override
    public int getCoffeePrice() {
        return 100;
    }
}
