package homework;

public class Developer extends Employee implements CodeWritable {
    public Developer(String name) {
        super(name);
    }

    @Override
    public void develop() {
        System.out.println("To develop");
    }
}
