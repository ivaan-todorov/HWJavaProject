package HW_7_1;

public class Director extends Manager {


    public Director(int baseSalary, String name, int numberOfEmployees) {
        super(baseSalary, name, numberOfEmployees);
    }

    public double getSalary() {
        if (getNumberOfEmployees() == 0) {
            return getBaseSalary();
        } else {
            return getBaseSalary() * (getNumberOfEmployees() / 100.0 * 9);
        }
    }
}
