import homework.*;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Developer developer = new Developer("Yoshi");
        Chief chief = new Chief("Joel");
        Driver driver = new Driver("Kostya");
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(developer);
        employees.add(chief);
        employees.add(driver);
        for (Employee employee: employees) {
            employee.voice();
        }

        ArrayList<Cookable> chiefs = new ArrayList<>();
        chiefs.add(chief);
        for (Cookable cookable : chiefs) {
            cookable.cook();
        }

        ArrayList<CodeWritable> developers = new ArrayList<>();
        developers.add(developer);
        for (CodeWritable codeWritable : developers) {
            codeWritable.develop();
        }

        ArrayList<Drivable> drivers = new ArrayList<>();
        drivers.add(driver);
        for (Drivable drivable : drivers) {
            drivable.drive();
        }
    }
}
