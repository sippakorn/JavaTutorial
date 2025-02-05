package io.sippbot.tutorial;

public abstract class AbstractClickPage implements ClickablePageInterface {
    @Override
    public void click() {
        System.out.println("Clicked");
    }
}
