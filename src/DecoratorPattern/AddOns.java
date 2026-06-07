package DecoratorPattern;

public abstract class AddOns implements Coffee {
    protected Coffee coffee;
    public AddOns(Coffee coffee){
        this.coffee = coffee;
    }


}
