package io.sippbot.tutorial;

public abstract class AbstractClickPage {
    @Override
    public void click() {
        System.out.println("Clicked");
    }

    protected void click2() {
        System.out.println("Clicked 2");
    }

    protected void click3(String test) {
    System.out.println("Clicked 3");
    }
}
