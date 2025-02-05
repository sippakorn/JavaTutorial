package io.sippbot.tutorial;

public class DoubleClickPage extends AbstractClickPage {
    public void click() {
        System.out.println("double click");
    }

    @Override
    protected void click2() {
        System.out.println("double click2");
    }
}
