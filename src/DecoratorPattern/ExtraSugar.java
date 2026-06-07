package DecoratorPattern;

public class ExtraSugar extends AddOns{
    public ExtraSugar(Coffee coffee) {
        super(coffee);
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
