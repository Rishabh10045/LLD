package FactoryDesignPattern;

public class ButtonFactory{
    private Button btn;
    public ButtonFactory(Button btn){
        this.btn = btn;
    }
    public Button getButton(){
        return btn;
    }
}
