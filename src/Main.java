import io.sippbot.tutorial.DoubleClickPage;
import io.sippbot.tutorial.SuperFastClickPage;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        DoubleClickPage doubleClickPage = new DoubleClickPage();
        doubleClickPage.click();

        SuperFastClickPage superFastClickPage = new SuperFastClickPage();
        superFastClickPage.process();
    }
}