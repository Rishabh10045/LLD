import FactoryDesignPattern.ButtonFactory;
import FactoryDesignPattern.WindowsBtn;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.

        // Factory Pattern implementation..
        ButtonFactory windowBtn = new ButtonFactory(new WindowsBtn());
        System.out.println(windowBtn.getButton().getButtonName()+" and "+ windowBtn+" and "+ windowBtn.getButton());

//        Coffee latte = new Latte();
//        System.out.println("Order : " + latte.getCoffeeName());
//        System.out.println("Total Cost : "+ latte.getCoffeePrice());
//
//        // Lattle+ Milk.
//        Coffee latteMilk = new Milk(latte);
//        System.out.println("Order : " + latteMilk.getCoffeeName());
//        System.out.println("Total Cost : "+ latteMilk.getCoffeePrice());
//        // Lattle+ Milk+ Caramel.
//        Coffee latteMilkCaramel = new Caramel(latteMilk);
//        System.out.println("Order : " + latteMilkCaramel.getCoffeeName());
//        System.out.println("Total Cost : "+ latteMilkCaramel.getCoffeePrice());



//        Coffee latte = new Latte();
//        System.out.println("Order : " + latte.getCoffeeName());
//        System.out.println("Total Cost : "+ latte.getCoffeePrice());
//
//        // Lattle+ Milk.
//        AddOns latteMilk = new Milk(latte);
//        System.out.println("Order : " + latteMilk.getCoffeeName());
//        System.out.println("Total Cost : "+ latteMilk.getCoffeePrice());
//        // Lattle+ Milk+ Caramel.
//        AddOns latteMilkCaramel = new Caramel(latteMilk);
//        System.out.println("Order : " + latteMilkCaramel.getCoffeeName());
//        System.out.println("Total Cost : "+ latteMilkCaramel.getCoffeePrice());
    }
}