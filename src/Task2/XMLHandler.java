package Task2;

public class XMLHandler extends AbstractHandler {
// Implements the methods from Abstract class
    @Override
    public void open() {
        System.out.println("Opening XML document...");
    }

    @Override
    public void create() {
        System.out.println("Creating XML document...");
    }

    @Override
    public void change() {
        System.out.println("Changing XML document...");
    }

    @Override
    public void save() {
        System.out.println("Saving XML document...");
    }
}
