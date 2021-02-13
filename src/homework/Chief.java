package homework;

public class Chief extends Employee implements Cookable {
    public Chief(String name) {
        super(name);
    }

    @Override
    public void cook() {
        System.out.println("To cook");
    }
}
