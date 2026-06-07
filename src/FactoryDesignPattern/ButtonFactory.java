package FactoryDesignPattern;

public class ButtonFactory implements Button{
    Button btn;
    public ButtonFactory(Button btn){
        this.btn = btn;
    }

//    public Button getButton(){
//
//    }

    @Override
    public String getBtnName() {
        return btn.getBtnName();
    }
}
