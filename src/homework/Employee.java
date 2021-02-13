package homework;

public class Employee {
    private String name;

    public Employee(String name) {
        this.name = name;
    }

    public final String getName() {
        return name;
    }

    public void voice() {
        System.out.println(name);
    }
}
